/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.helloword;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class MangSinhVien {
    public static void main(String[] args) {
          String svs[]=new String[5]; 
          Scanner s=new Scanner(System.in);
          for(int i=0;i<5;i++){
              System.out.printf("nhập phần tử %d",i+1);
              svs[i]=s.nextLine();
          }
          System.out.println("Mảng sinh viên:"+Arrays.toString(svs));
    }
}
