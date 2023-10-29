package org.example.entities;

public class Car {
    //Attributes
    private String brand;
    private String color;
    private String model;
    private double price;
    private String id;
    private boolean damaged;
    private int baggageCapacity;

    public Car(){

    }


    public Car(String brand, String color, String model, double price, boolean damaged, int baggageCapacity) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.price = price;
        this.damaged = damaged;
        this.baggageCapacity = baggageCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = brand.substring(0,1) + color.substring(0,1) + model.substring(0,1);
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public int getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(int baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    public void printCars(){
        System.out.println("*********************");
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Model: " + this.getModel());
        System.out.println("Color: " + this.getColor());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Damaged: " + this.isDamaged());
        System.out.println("Baggage Capacity: " + this.getBaggageCapacity());
    }
}
