/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.haui.poly.kt1;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class KT1 {

    public static void main(String[] args) {
         QLSV qlsv = new QLSV();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi sinh vien ");
            System.out.println("3. Tim kiem sinh vien");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:");
            int chon=s.nextInt();
            switch (chon) {
                case 1:
                    qlsv.addStudent();
                    break;
                case 2:
                    qlsv.displayStudents();
                case 3:
                    qlsv.searchStudents();
                case 4:
                    System.exit(0);
                    
                    break;
                default:
                    throw new AssertionError();
            }
    }
}
}