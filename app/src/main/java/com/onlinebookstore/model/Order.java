package com.onlinebookstore.model;

public class Order {
    private int id;
    private int userID;
    private int quantity;
    private int orderDate;
    private String status;

    public Order() {}

    public Order(int userID, int quantity, int orderDate, String status) {
        this.userID = userID;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.status = status;
    }

    public Order(int id, int userID, int quantity, int orderDate, String status) {
        this.id = id;
        this.userID = userID;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(int orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
