package org.example.models;

public class Order {
    private int orderId;
    private String shipName;
    public Order(int orderId, String shipName){
        this.orderId = orderId;
        this.shipName = shipName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
}
