/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.haui.poly.sanpham1;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class SanPham1 {
    private String tenSp;
    private Double giaSp;
    public SanPham1(){
        this.tenSp=null;
        this.giaSp=0.0;
    };

    public SanPham1(String tenSp, Double giaSp) {
        this.tenSp = tenSp;
        this.giaSp = giaSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public Double getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(Double giaSp) {
        this.giaSp = giaSp;
    }
    
    
    
}
