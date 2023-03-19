/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.assignment;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class DanhSachNhanVien {
    private ArrayList<NhanVien> list=new ArrayList<>();
    public void nhap(){
        do {            
            Scanner s=new Scanner(System.in);
            System.out.print("Nhap ma nhan vien :");
            String maNV=s.nextLine();
            if(maNV.equals("")){
                break;
            }
            System.out.print("Nhap ho ten nhan vien :");
            String hoTen=s.nextLine();
            System.out.print("Nhap luong co ban :");
            double luong=s.nextDouble();
            System.out.print("Nhap ten phong ban :");
            String loai=s.nextLine();
            s.nextLine();
            if(loai.equalsIgnoreCase("Hanh chinh")){
                System.out.print("Nhap ngay cong :");
                double ngayLuong=s.nextDouble();
                NhanVien newNV=new NhanVienHanhChinh(maNV, hoTen, loai,luong,ngayLuong);
                list.add(newNV);
            }else if(loai.equalsIgnoreCase("Kinh doanh")){
                System.out.print("Nhap luong kinh doanh :");
                double luongKinhDoanh=s.nextDouble();
                NhanVien nv1=new NhanVienKinhDoanh(maNV, hoTen, loai, luong,luongKinhDoanh);
                list.add(nv1);
            }
            
        } while (true);
    }
    public void xuat(){
             for (NhanVien nv : list) {
                 System.out.printf("Ma nhan vien :%s | Ho ten : %s | Phong ban : %s | Luong : %.2f\n",nv.getMaNV()
                         ,nv.getHoTen(),nv.getLoai(),nv.getLuong());
             }
         }
    public String GetInputValue(String ma){
        Scanner s=new Scanner(System.in);

        System.out.print("Moi ban nhap %s :"+ma);
        return s.nextLine();
    }
    public int getIndex(){
         String maNV=GetInputValue("ma");
         for(int i=0;i<list.size();){
             if(list.get(i).getMaNV().equals(maNV)){
                 return i;
             }else{
                 i++;
             }
         }
         return -1;
    } 
    
    public void menu(){
        int choice=0;
        
        do {            
         Scanner s=new Scanner(System.in);
        System.out.println("Menu chuong trinh");
        System.out.println("1.Nhap danh sach nhan vien");
        System.out.println("2.Xuat danh sach nhan vien");
        System.out.println("3.Tim nhan vien theo ma");
        System.out.println("4.Xoa");
        System.out.println("0.Thoat");
        System.out.print("Moi ban nhap lua chon :");
        choice=s.nextInt();
        switch(choice){ 
            case 0:
                System.exit(0);
                break;
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break;
            default:
                System.out.println("Khong co lua chon nay,Vui long nhap lai!!");
               
                
        }
        } while (true);
    }
 
}
