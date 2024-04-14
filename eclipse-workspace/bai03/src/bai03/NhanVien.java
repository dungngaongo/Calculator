package bai03;
import java.util.List;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double LUONG_MAX;
    private static int soLuongNhanVien = 0;

    public NhanVien(String tenNhanVien, double luongCoban, double heSoluong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoban;
        this.heSoLuong = heSoluong;
        soLuongNhanVien++;
    }

    // LUONGMAX
    public void setLuongMAX(double luongMAX) {
        this.LUONG_MAX = luongMAX;
    }

    public double getLuongMAX() {
        return LUONG_MAX;
    }

    // In thong tin nhan vien
    public void inTTin() {
        System.out.println("-------------- Thong tin nhan vien --------------");
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong co ban : " + luongCoBan);
        System.out.println("He so luong  : " + heSoLuong);
        System.out.printf("LUONG MAX    : %.3f \n", LUONG_MAX);
        System.out.println("-------------------------------------------------");

    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public boolean tangLuong(double heSoTang) {
        if (luongCoBan * (heSoLuong + heSoTang) <= LUONG_MAX) {
            heSoLuong += heSoTang;
            System.out.println("[True] Tang luong thanh cong");
            return true;
        } else {
            System.out.println("[False] Tang luong khong thanh cong");
            return false;
        }
    }
    
    public static int demSoLuongNhanVien() {
    	return soLuongNhanVien;
    }
    
    public static double tinhTongLuong(List<NhanVien> danhSachNhanVien) {
    	double tongLuong = 0;
    	for(NhanVien nv : danhSachNhanVien) {
    		tongLuong += nv.tinhLuong(); 
    	}
    	return tongLuong;
    }
}
