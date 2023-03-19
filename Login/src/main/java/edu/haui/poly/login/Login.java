/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.haui.poly.login;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class Login {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Nhap username :");
        String user=s.nextLine();
        System.out.print("Nhap password :");
        String password=s.nextLine();
        if(user.equalsIgnoreCase("Hello") && password.length()>6){
            System.out.println("Dang nhap thanh cong");
        }else{
            System.out.println("Loi");
        }
        
    }
}
