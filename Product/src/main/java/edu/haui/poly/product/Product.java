/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.haui.poly.product;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class Product {
    private String productId;
    private String productName;
    private  double productPrice;
    private  int productTotal;
    public Product(){}

    public Product(String productId, String productName, double productPrice, int productTotal) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productTotal = productTotal;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductTotal() {
        return productTotal;
    }

    public void setProductTotal(int productTotal) {
        this.productTotal = productTotal;
    }
    @Override
    public String toString(){
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productTotal=" + productTotal +
                '}';
    }
    
}
