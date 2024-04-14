package bai05;

public class StringPerformanceComparison {
    public static void main(String[] args) {
        int iterations = 10000; // Số lần lặp
        
        // Đo thời gian cho phép cộng xâu với String
        long startTimeString = System.nanoTime();
        String resultString = appendStringWithString("Hello", iterations);
        long endTimeString = System.nanoTime();
        long durationString = endTimeString - startTimeString;
        System.out.println("Time taken with String: " + durationString + " nanoseconds");
        
        // Đo thời gian cho phép cộng xâu với StringBuffer
        long startTimeBuffer = System.nanoTime();
        String resultBuffer = appendStringWithStringBuffer("Hello", iterations);
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("Time taken with StringBuffer: " + durationBuffer + " nanoseconds");
    }

    // Phép cộng xâu với String
    public static String appendStringWithString(String base, int iterations) {
        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += base;
        }
        return result;
    }

    // Phép cộng xâu với StringBuffer
    public static String appendStringWithStringBuffer(String base, int iterations) {
        StringBuffer resultBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            resultBuffer.append(base);
        }
        return resultBuffer.toString();
    }
}

