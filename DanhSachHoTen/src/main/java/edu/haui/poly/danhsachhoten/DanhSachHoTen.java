/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.haui.poly.danhsachhoten;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class DanhSachHoTen {
     private ArrayList<String> strings=new ArrayList<>();
     public void nhap(){
         Scanner s=new Scanner(System.in);
         do {             
             String st=s.nextLine();
             if(st.isEmpty()){
                 break;
             }
             strings.add(st);
             
         } while (true);
     }
     public void xuat(){
         System.out.println("Danh sach ho ten :");
         for (String items : strings) {
             System.out.print("  "+items);
             
         }
         System.out.println("");
     }
     public void xuatNgauNhien(){
         Collections.shuffle(strings);
         xuat();
     }
     public void sapXep(){
         Collections.sort(strings,(a, b) -> a.compareTo(b)); 
         xuat();
        
   
     }
    public int getIndex(){
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap ho ten can xoa :");
        String hoTen=s.nextLine();
        for (int i = 0; i < strings.size(); i++) {
             String getString=strings.get(i);
             if(getString.equals(hoTen)){
                 return i;
                
             }
        }
         return -1;
    }
    public void Xoa(){
        int index=getIndex();
       if(index!=-1){
           System.out.println("Khong tim thay ten de xoa");
       }else{
           strings.remove(index);
       }
        
    }
    public void danhSachChuongTrinh(){
        Scanner s=new Scanner(System.in);
        
        do {            
            System.out.println("============================");
            System.out.println("Menu chuong trinh ");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Sap xep danh sach");
            System.out.println("4. Hien thi ngau nhien");
            System.out.println("5. Xoa danh sach");
            System.out.println("6. Thoat chuong trinh");
            System.out.println("Lua chon cua ban ");
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
                    Xoa();
                    break;
                case 6:
                    System.exit(0);
                   
                     
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }
}
