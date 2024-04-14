package bai03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<NhanVien> danhSachNhanVien = new ArrayList<>(); 
        
        System.out.println("Nhap thong tin nhan vien 1: ");
        NhanVien nv1 = new NhanVien(sc.next(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Nhap LUONGMAX: ");
        double luongMax1 = sc.nextDouble();
        nv1.setLuongMAX(luongMax1);

        System.out.println("Nhap thong tin nhan vien 2: ");
        NhanVien nv2 = new NhanVien(sc.next(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Nhap LUONGMAX: ");
        double luongMax2 = sc.nextDouble();
        nv2.setLuongMAX(luongMax2);

        nv1.inTTin();
        nv2.inTTin();
        
        danhSachNhanVien.add(nv1);
        danhSachNhanVien.add(nv2);

        // Hien thi luong
        System.out.println("Luong nhan vien 1: " + nv1.tinhLuong());
        System.out.println("Luong nhan vien 1: " + nv2.tinhLuong());
        System.out.println();

        // Tang luong
        System.out.println("Nhap he so tang luong cho nv1: ");
        double heSo1 = sc.nextDouble();
        nv1.tangLuong(heSo1);
        System.out.println("Nhap he so tang luong cho nv2: ");
        double heSo2 = sc.nextDouble();
        nv1.tangLuong(heSo2);
        
        //Dem so luong nhan vien
        System.out.println("So luong nhan vien: " + NhanVien.demSoLuongNhanVien());
        
        //Tinh tong luong cac nhan vien
        double tongLuong = NhanVien.tinhTongLuong(danhSachNhanVien);
        System.out.println("Tong luong: " + tongLuong);
        
        sc.close();
    }
}
