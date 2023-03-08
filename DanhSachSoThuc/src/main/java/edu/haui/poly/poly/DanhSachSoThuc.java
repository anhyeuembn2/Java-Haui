/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.haui.poly.poly;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class DanhSachSoThuc {
    private ArrayList<Double> list=new ArrayList<>();
    public void nhap(){
        System.out.println("Nhap danh sach so thuc ");
        Scanner s=new Scanner(System.in);
        int yes=1;
        list.clear();
        do {            
            System.out.println("nhap so :");
            double num=s.nextDouble();
            list.add(num);
            System.out.println("Ban co muon nhap tiep (chon 1 -0)");
            yes=s.nextInt();
            
        } while (yes==1);
    }
    public void hienThi(){
        System.out.println("=========================");
        for(Double item :list){
            System.out.print(" "+item);
        }
        System.out.println("");
    }
    public void tinhTong(){
        double sum=0;
        for(Double item:list){
            sum+=item;
        }
        System.out.printf("Tong cac so thuc :%f",sum);
    }
   
}
