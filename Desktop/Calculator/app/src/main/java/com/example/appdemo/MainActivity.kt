package com.example.appdemo

import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private lateinit var textViewResult: TextView
    private var currentInput: String = ""
    private var result: Int = 0
    private var operator: String = ""
    private var isOperatorPressed: Boolean = false
    private var lastOperatorButton: Button? = null // Để lưu lại nút toán tử cuối cùng

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textViewResult = findViewById(R.id.textViewResult)

        // Thiết lập sự kiện cho các nút số và toán tử
        setNumberButtonListeners()
        setOperatorButtonListeners()
    }

    private fun setNumberButtonListeners() {
        val numberButtonIds = arrayOf(
            R.id.button0, R.id.button1, R.id.button2, R.id.button3,
            R.id.button4, R.id.button5, R.id.button6, R.id.button7,
            R.id.button8, R.id.button9
        )

        val listener = { view: Button ->
            currentInput += view.text.toString()
            textViewResult.text = currentInput
            resetOperatorButtonColor() // Khi nhấn số thì bỏ màu của nút toán tử
        }

        for (id in numberButtonIds) {
            findViewById<Button>(id).setOnClickListener { listener(it as Button) }
        }
    }

    private fun setOperatorButtonListeners() {
        findViewById<Button>(R.id.buttonAdd).setOnClickListener { operatorPressed(findViewById<Button>(R.id.buttonAdd), "+") }
        findViewById<Button>(R.id.buttonSubtract).setOnClickListener { operatorPressed(findViewById<Button>(R.id.buttonSubtract), "-") }
        findViewById<Button>(R.id.buttonMultiply).setOnClickListener { operatorPressed(findViewById<Button>(R.id.buttonMultiply), "*") }
        findViewById<Button>(R.id.buttonDivide).setOnClickListener { operatorPressed(findViewById<Button>(R.id.buttonDivide), "/") }

        findViewById<Button>(R.id.buttonEqual).setOnClickListener { performCalculation() }

        findViewById<Button>(R.id.buttonC).setOnClickListener {
            currentInput = ""
            result = 0
            operator = ""
            textViewResult.text = "0"
            resetOperatorButtonColor() // Bỏ màu của nút toán tử khi reset
        }
    }

    private fun operatorPressed(button: Button, op: String) {
        if (currentInput.isNotEmpty()) {
            result = currentInput.toInt()
            currentInput = ""
        }
        operator = op
        isOperatorPressed = true

        // Đổi màu của nút toán tử được nhấn
        resetOperatorButtonColor() // Đặt lại màu nút toán tử trước đó
        button.setBackgroundColor(ContextCompat.getColor(this, R.color.operator_pressed_color)) // Đổi màu
        lastOperatorButton = button // Lưu nút vừa nhấn
    }

    private fun resetOperatorButtonColor() {
        // Đặt lại màu cho nút toán tử trước đó
        lastOperatorButton?.setBackgroundColor(ContextCompat.getColor(this, R.color.operator_default_color))
    }


    private fun performCalculation() {
        if (currentInput.isNotEmpty() && isOperatorPressed) {
            val secondOperand = currentInput.toInt()
            when (operator) {
                "+" -> result += secondOperand
                "-" -> result -= secondOperand
                "*" -> result *= secondOperand
                "/" -> result /= secondOperand
            }
            textViewResult.text = result.toString()
            currentInput = ""
            isOperatorPressed = false

            resetOperatorButtonColor() // Sau khi tính xong thì bỏ màu nút toán tử
        }
    }
}