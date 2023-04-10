/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.haui.poly.product;
import java.util.List;
/**
 *
 * @author Nguyen Hai Trieu
 */
public interface InteriorManager {
    boolean addInterior(Interior i);

    boolean editInterior(Interior i);

    boolean deleteInterior(Interior productId);

    List<Interior> searchInterior(String keyword);

    List<Interior> sortInterior(double price);
}
