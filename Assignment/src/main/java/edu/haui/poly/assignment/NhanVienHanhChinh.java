/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.assignment;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class NhanVienHanhChinh extends NhanVien {
    private  double ngayCong;
    
    public NhanVienHanhChinh(String maNV, String hoTen, String loai, double luong,double  ngayLuong) {
        super(maNV, hoTen, loai, luong);
        this.ngayCong=ngayLuong;
    }

    public double getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(double ngayCong) {
        this.ngayCong = ngayCong;
    }

    @Override
    public double getLuong() {
        return super.getLuong()*ngayCong;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
        
    
}
