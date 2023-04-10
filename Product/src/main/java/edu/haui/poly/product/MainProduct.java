/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.product;
import java.util.List;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class MainProduct {
    public static void main(String[] args) {
        InteriorManagerImpl manager=new InteriorManagerImpl();
       manager.addInterior(new Interior("SP001", "Ban cho",
               1500000,"Rat tot", 10, "Go"));
       manager.addInterior(new Interior("SP002", "Ghe sofa", 3000000,"Tot", 8, "Da"));
    manager.addInterior(new Interior("SP003", "Ke sach", 2000000,"Tot", 5, "Go"));
    manager.addInterior(new Interior("SP004", "Bo ban an", 5000000,"Kha", 3, "Go"));
    manager.addInterior(new Interior("SP005", "Ghe xoay van phong", 
            1000000,"Kha", 15, "Da"));
        System.out.println("Danh sach san pham :");
      manager.printAllInterior();
        System.out.println("Tim kiem san pham theo ten :");
        List<Interior> foundByName = manager.searchInterior("Ke sach");
        for(Interior i: foundByName){
            System.out.println(i);
        }
        System.out.println("Sap xep san pham theo gia :");
        List<Interior> sortedByPrice = manager.sortInterior(0);
        for (Interior i : sortedByPrice) {
        System.out.println(i);
        }
        System.out.println("chinh sua thong tin cua sp001 :");
        Interior sp001=new Interior("SP001", "Ban tr go oc cho",
               1500000,"Rat tot", 10, "Gỗ");
        manager.editInterior(sp001);
        System.out.println("Danh sach sau khi chinh sua");
        manager.printAllInterior();
        System.out.println("Xoa san pham sp003 khoi he thong :");
        manager.deleteInterior(new Interior("SP003", "Kệ sách gỗ thông", 2000000,"Tot", 5, "Gỗ"));
        manager.printAllInterior();
        


    }
}
