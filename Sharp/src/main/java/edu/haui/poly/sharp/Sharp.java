/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.haui.poly.sharp;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class Sharp {
    public static int x=30;
    static {
        x=50;
        System.out.println("static block:"+x);
    }
    public static void moveTo(){
        System.out.println("moveTo"+x);
        x=100;
        System.out.println("moveTo"+x);
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
