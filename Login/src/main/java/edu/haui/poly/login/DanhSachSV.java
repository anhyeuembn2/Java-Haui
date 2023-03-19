/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.login;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class DanhSachSV {
    public static void main(String[] args) {
         ArrayList<String> list=new ArrayList<>();
         Scanner s=new Scanner(System.in);
         int i=1;
         do {            
             System.out.printf("Nhap ho ten sinh vien thu :%d",i);
             String st=s.nextLine();
             if(st==null || st.equals("")){
                  break;
             }
             list.add(st);
             i++;
        } while (true);
         for (String item : list) {
            item=item.trim();
            String ho=item.substring(0, item.indexOf(""));
            String ten=item.substring(item.lastIndexOf(""));
            
        }
    }
}
