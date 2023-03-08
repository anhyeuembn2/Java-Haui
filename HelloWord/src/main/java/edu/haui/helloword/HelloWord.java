/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edu.haui.helloword;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class HelloWord {
   String hoTen;
   double diemTb;
   public  HelloWord(){
       hoTen="Trieu";
       diemTb=9;
   }
   public  HelloWord(String hoTen,double diemTB){
       this.hoTen=hoTen;
       this.diemTb=diemTB;
   }
   
   // tao ra ham tao (constructer) co the co tham so hoac khong
   public void nhap(){
       Scanner s=new Scanner(System.in);
       System.out.println("Nhap ho ten :");
       hoTen=s.nextLine();
       System.out.println("Nhap diem TB :");
       diemTb=s.nextDouble();
       
   }
   public void xuat()
   {
       System.out.println("\n-------------------------");
       System.out.printf("Ho ten sinh vien : %s - diem TB :%f- hoc luc : %s",hoTen,diemTb,xepLoai());
   }
   public String xepLoai(){
       if(diemTb>=9){
           return "Xuat Sac";
       }else {
           return "Gioi";
       }
   }
     
}
