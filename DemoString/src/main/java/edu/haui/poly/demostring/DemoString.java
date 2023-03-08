/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.haui.poly.demostring;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class DemoString {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int i=1;
        do{
            System.out.printf("Nhap sinh vien thu :%d",i);
            String hoTen=s.nextLine();
            if(hoTen==null || hoTen.equals("")){
                 break;
            }
            list.add(hoTen);
            i++;
        }while (true);
        for (String item : list) {
            item=item.trim();
            if(item.startsWith("Tuan") || item.endsWith("Nguyen")){
                String ho=item.substring(0, item.indexOf(""));
                String ten=item.substring(item.lastIndexOf(""));
                String hoDem=item.substring(item.indexOf(""),item.lastIndexOf(""));
                
                
            }
        }
 
  }
    
        /*
         THAO TAC VOI CHUOI
        So sanh
        Tim vi tri chuoi con
        Lay chuoi con
        Tach va hop chuoi
        Chuyen doi 
        sang hoa thuong
        Lay do dai
        ToLowecase chuyen hoa thanh thuong
        ToUpperCase chuyen thuong thanh hoa
        trim xoa khoang trang o dau va cuoi
        length lay ra do dai mang
        substring lay la chuoi con'
        charAt lay ki tu tai vi tri
        replace(find,replace) tim kiem va thay the
        split chuyen chuoi thanh mang
        equals so sanh chuoi co phan biet hoa va thuong
        equalsignore so sanh k phan biet hoa thuongc
        contains kiem tra xem co chua hay khong
        startwidth bat dau voi
        endWidth ket thuc voi
        matches so sanh xem khop k
        indexof tim kiem vi tri dau
        lastIndexof
        */
        
    }
}
