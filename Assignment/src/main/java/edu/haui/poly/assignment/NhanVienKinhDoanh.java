/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.assignment;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class NhanVienKinhDoanh extends  NhanVien {
    private  double luongKinhDoanh;
    public NhanVienKinhDoanh(String maNV, String hoTen, String loai, double luong,double luongKinhDoanh) {
        super(maNV, hoTen, loai, luong);
        this.luongKinhDoanh=luongKinhDoanh;
    }

    public double getLuongKinhDoanh() {
        return luongKinhDoanh;
    }

    public void setLuongKinhDoanh(double luongKinhDoanh) {
        this.luongKinhDoanh = luongKinhDoanh;
    }

    @Override
    public double getLuong() {
        return super.getLuong()*luongKinhDoanh;
    }
    
}
