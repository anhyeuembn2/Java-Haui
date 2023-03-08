/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.haui.poly.danhsachsinhvien;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class DanhSachSinhvien {
     private ArrayList<String> list=new ArrayList<>();
     public void nhap(){
         Scanner s=new Scanner(System.in);
         do {             
             System.out.print("Nhap ho ten :");
             String st=s.nextLine();
             if(st.isEmpty()){
                 break;
             }
             list.add(st);
             
         } while (true);
     }
     public void xuat(){
         System.out.println("Danh sach ho ten :");
         for (String items : list) {
             System.out.println("Danh sach ho ten :"+items);
         }
         System.out.println("");
     }
     public void xuatNgauNhien(){
         Collections.shuffle(list);
         xuat();
     }
     public void sapXep(){
         Collections.sort(list);
         Collections.reverse(list);
         xuat();
        
     }
     public void timVaXoa(){
         Scanner s=new Scanner(System.in);
         System.out.print("Nhap ho ten tim va xoa :");
         String hoTen=s.nextLine();
         for(int i=0;i<list.size();){
             if(list.get(i).equals(hoTen)){
                 list.remove(i);
             }else{
                 i++;
             }
         }
     }
     public void hienThiMenu(){
         Scanner s=new Scanner(System.in);
         do {
             System.out.println("------------------------------------");
             System.out.println("Menu chuc nang chuong trinh");
             System.out.println("1.Nhap danh sach");
             System.out.println("2.Hien thi danh sach");
             System.out.println("3.Sap xep danh sach");
             System.out.println("4.Hien thi ngau nhien");
             System.out.println("5.Tim kiem va xoa ho ten");
             System.out.println("6.Thoat chuong trinh");
             System.out.print("LUa chon cua ban :");
             int choice=s.nextInt();
             switch (choice) {
                 case 1:
                     nhap();
                     
                     break;
                 case 2:
                     xuat();
                     break;
                 case 3:
                     sapXep();
                     break;
                 case 4:
                     xuatNgauNhien();
                     break;
                 case 5:
                     timVaXoa();
                     xuat();
                     break;
                 case 6:
                     System.exit(0);
                 default:
                     throw new AssertionError();
             }
         } while (true);
     }
}
