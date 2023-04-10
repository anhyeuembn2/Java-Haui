/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.product;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class Interior extends Product {
    private String description; // mieu ta
    private int quantity; // so luong
    private String brand; // nhan hang
    public Interior(){}
     public Interior(String productId, String productName, double productPrice, String description, int quantity, String brand) {
        super(productId, productName, productPrice, 0);
        this.description = description;
        this.quantity = quantity;
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
     @Override
    public String toString() {
        return "Interior{" +
                "productId='" + getProductId() + '\'' +
                ", productName='" + getProductName() + '\'' +
                ", productPrice=" + getProductPrice() +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", brand='" + brand + '\'' +
                '}';
    }
}
