/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.sanpham1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class DanhSachSanPham {
    private  ArrayList<SanPham1> list=new ArrayList<>();
    int i=1;
    public void nhap(){
        System.out.printf("Nhap san pham thu :%s",i);
        Scanner s=new Scanner(System.in);
        do {
            String st=s.nextLine();
            if(st==null || st.equals("")){
                break;
            }
            System.out.println("Nhap gia san pham :");
            Double gia=s.nextDouble();
            list.add(new SanPham1(st,gia));
            s.nextLine();
        } while (true);
    }
    public void xuat()
    {
        System.out.println("Danh sach san pham :");
        System.out.println("Ten\t\t|Gia\t\t");
        for (SanPham1 items : list) {
            System.out.printf("%s | %.2f \n",items.getTenSp(),items.getGiaSp());
            
        }
    }
    public void sapXep(){
        Collections.sort(list,(a, b) -> (int) (a.getGiaSp()-b.getGiaSp()));
        System.out.println("Danh sach san pham sau khi sap xep ");
        xuat();
    }
    public int getIndex(){
        System.out.println("Nhap ten san pham can xoa :");
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        for (int j = 0; j < list.size(); j++) {
            SanPham1 getIndex = list.get(j);
            if(getIndex.getTenSp().equals(st)){
                return j;
            }
            
        }
        return -1;
    }
    public void xoa(){
        int index=getIndex();
        if(index!=-1){
            list.remove(index);
        }else{
            System.out.println("Khong tim thay san pham");
        }
    }
}
    