/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.haui;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class SanPham {
  private String tenSp;
  private double  donGia;
  private double giamGia;
  public void nhap(){
      Scanner s=new Scanner(System.in);
      System.out.println("Nhap ten san pham :");
      tenSp=s.nextLine();
      System.out.println("Nhap don gia :");
      donGia=s.nextDouble();
      System.out.println("Nhap ma giam gia :");
      giamGia=s.nextDouble();
  }
    public SanPham(){}
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
  public void xuat()
  {
      System.out.printf("Ten san pham :%s,don gia :%f- giam gia :%f- thue :%f",tenSp,donGia,giamGia,thueNhapKhau());
  }
  public double thueNhapKhau(){
      return donGia*0.1;
  }
}
