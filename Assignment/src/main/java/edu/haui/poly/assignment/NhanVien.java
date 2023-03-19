/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.assignment;

/**
 *
 * @author Nguyen Hai Trieu
 */
public abstract class NhanVien {
    private String maNV;
    private String hoTen;
    private String loai;
    private  double luong;

    public NhanVien(String maNV, String hoTen, String loai, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.loai = loai;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    abstract  double getLuong();
        
   
    
}
