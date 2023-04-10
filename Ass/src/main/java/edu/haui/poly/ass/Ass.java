/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.haui.poly.ass;
import java.util.regex.Pattern;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */

/*
 [abc] dai dien 1 ki tu a ,b,c
[^abc] dai dien 1 ki tu k phai la a b c
[a-z] dai dien 1 ki tu tron khoang tu a-z
\d tuong duong [0-9]
\w tg duong [0-9a-zA-Z_]
\D tuong tuong {^0-9]
\W td tu
. trung voi bất kì kí tự nào
^ chi ra mẫu bắt đầu
$ chỉ ra mẫu kết thúc
{M,N} it nhất m nhiều nhất n
{n} đung n lần
? 0-1
* 0-n 
+ 1-n 
0 la 1
[0-9]{3,}
456
45


*/

public class Ass {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("Nhap so dien thoai :");
        String phone=s.nextLine();
        String pattern="^[^0-9]$";
        if(ReadPendingException.){ // nếu
            System.out.println("khong la so");
        }else{
            System.out.println("dug");
        }
        
        
    }
}
