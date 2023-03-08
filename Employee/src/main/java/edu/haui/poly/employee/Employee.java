/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.haui.poly.employee;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class Employee {
   String hoTen;
   float diem;
   public void nhap(){
       Scanner s=new Scanner(System.in);
       System.out.print("Nhap ho ten :");
       hoTen=s.nextLine();
       System.out.print("Nhap diem :");
       diem=s.nextFloat();
   }
   public void xuat(){
       System.out.println("--------------------------");
       System.out.printf("Ho ten sinh vien :%s- diem :%.2f-Hoc luc :%s",hoTen,diem,xepLoai());
   }
   public String xepLoai(){
       if(diem>=9){
           return "Xuat sac";
       }
       return "Kha";
   }
}
