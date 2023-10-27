package org.example.models;

public class Product {
    private String name;
    private double unitPrice;
    public Product(String name, double unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void printProduct(){
        System.out.println("Product Name: " + this.getName());
        System.out.println("Product Unit Price: " + this.getUnitPrice());
        System.out.println("----------------------------------");
    }
}
