/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.poly;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class MainClass {
    public static void main(String[] args) {
        DanhSachSoThuc ds=new DanhSachSoThuc();
        int choice=0;
        Scanner s=new Scanner(System.in);
        do {            
            System.out.println("Menu chuong trinh");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tinh tong");
            
            System.out.println("0. Thoat chuong trinh");
            choice=s.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    
                    ds.nhap();
                    break;
                case 2:
                    ds.hienThi();
                    break;
                case 3:
                    ds.tinhTong();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (choice!=0);
        System.out.println("Chuong trinh ket thuc");
    }
}
