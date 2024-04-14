package bai03;

class NhanVien {
	private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double LUONG_MAX;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = LUONG_MAX;
    }

    public String getTen() {
        return tenNhanVien;
    }

    public void setTen(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLuongToiDa() {
        return LUONG_MAX;
    }

    public void setLuongToiDa(double LUONG_MAX) {
        this.LUONG_MAX = LUONG_MAX;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương tối đa: " + LUONG_MAX);
        System.out.println("Lương: " + tinhLuong());
    }

    public boolean tangLuong(double tangThem) {
        double newHeSo = heSoLuong + tangThem;
        if (tinhLuong() > LUONG_MAX) {
            System.out.println("Lương vượt quá lương tối đa cho phép.");
            return false;
        } else {
            heSoLuong = newHeSo;
            return true;
        }
    }
}
