/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.helloworld;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class Operator {
    public static void main(String[] args) {
        int a,b=0;
        System.out.print("Nhap a:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.print("Nhap b :");
        b=s.nextInt();
        int sum=a+b;
        int hieu=a-b;
        int nhan=a*b;
        float chia=a/b;
        int layDu=a%b;
        System.out.printf("Tong :%d"+sum);
        System.out.printf("Hieu :%d"+hieu);
        System.out.printf("Nhan :%d"+nhan);
        System.out.printf("Chia :%.2f"+chia);
        System.out.print("Lay du :%d"+layDu);
    }
}
