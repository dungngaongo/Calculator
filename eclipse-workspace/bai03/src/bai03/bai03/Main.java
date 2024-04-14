package bai03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo đối tượng nhân viên
        NhanVien nhanVien = new NhanVien("Nguyen Van A", 1000000, 1.5, 20000000);

        // Hiển thị thông tin nhân viên
        System.out.println("Thông tin nhân viên trước khi tăng lương:");
        nhanVien.inTTin();
        System.out.println();

        // Tăng lương cho nhân viên và kiểm tra kết quả
        double tangThem = 0.5;
        System.out.println("Tăng hệ số lương thêm: " + tangThem);
        boolean ketQua = nhanVien.tangLuong(tangThem);
        if (ketQua) {
            System.out.println("Tăng lương thành công.");
        } else {
            System.out.println("Không thể tăng lương.");
        }
        System.out.println();

        // Hiển thị thông tin nhân viên sau khi tăng lương
        System.out.println("Thông tin nhân viên sau khi tăng lương:");
        nhanVien.inTTin();
    	}
	}

