/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.danhsachproduct;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class SanPham {
    private ArrayList<DanhSachProduct> list=new ArrayList<>();
    public void nhap(){
        Scanner s=new Scanner(System.in);
        int i=1;
         System.out.println("Nhap danh sach san pham");
        do {            
            System.out.printf("Ten san pham thu %d :",i);
            String st=s.nextLine();
            if(st==null || st.equals("")){
                break;
            }
            System.out.println("Gia san pham :");
            double price=s.nextDouble();
            list.add(new DanhSachProduct(st,price));
            s.nextLine();
            
            
        } while (true);
    }
    public void hienThi(){
        System.out.println("Danh sach san pham");
        System.out.println("Ten\t\t | Gia\t\t");
        for (DanhSachProduct item : list) {
            System.out.printf("%20s | %.2f \n",item.getGiaSanPham(),item.getGiaSanPham());
        }
    }
    public void sapXep(){
        Collections.sort(list,(a,b)->(int)(a.getGiaSanPham()-b.getGiaSanPham()));
        hienThi();
    }
    public String getName(){
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap ten san pham :");
        return s.nextLine();
    }
    public void timKiem(){
        String name=getName();
        DanhSachProduct found=null;
        for (DanhSachProduct item : list) {
            if(item.getTenSanPham().equals(name)){
                found=item;
                break;
            }
        }
        if(found!=null){
            list.remove(found);
            hienThi();
        }else{
            System.out.println("San pham khong co trong danh sach");
        }
    }
    public void menu(){
        do {      
            Scanner s=new Scanner(System.in);
            System.out.println("1.Nhap san pham");
            System.out.println("2.Xuat san pham");
            System.out.println("3.Xoa san pham");
            System.out.println("4.Thoat chuong trinh");
            System.out.print("Moi ban nhap lua chon");
            int choice=s.nextInt();
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    hienThi();
                    break;
                case 3:
                    timKiem();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Gia tri nhap khong dung");
            }
        } while (true);
    }
}
