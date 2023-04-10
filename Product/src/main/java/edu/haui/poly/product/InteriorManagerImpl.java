/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.product;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class InteriorManagerImpl implements InteriorManager{
    private List<Interior> interiors=new ArrayList<>();
    @Override
    public boolean addInterior(Interior i) {
        return interiors.add(i);
    }

    @Override
    public boolean editInterior(Interior i) {
        for(int j=0;j<interiors.size();j++){
            if(interiors.get(j).getProductId().equals(i.getProductId())){
                interiors.set(j, i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteInterior(Interior productId) {
        for (Interior i : interiors) {
        if (i.getProductId().equals(productId.getProductId())) {
            interiors.remove(i);
            return true;
        }
    }
    return false;
    }

    @Override
    public List<Interior> searchInterior(String keyword) {
         List<Interior> result = new ArrayList<>();
         for (Interior i : interiors) {
            if (i.getProductName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(i);
            }
        }
         return result ;
    }

    @Override
    public List<Interior> sortInterior(double price) {
        List<Interior> sortedList = new ArrayList<>(interiors);
        Collections.sort(sortedList, (i1, i2) -> Double.compare(i1.getProductPrice(), i2.getProductPrice()));
        return sortedList;
    }
    public void printAllInterior() {
    for (Interior i : interiors) {
        System.out.println(i.toString());
    }
}
    
}
