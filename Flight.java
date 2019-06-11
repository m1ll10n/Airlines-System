package com.company;

public class Flight {

    private String id;
    private String destination;
    private int quantity;
    private double price;
    private String buyer;
    private String date;

    public Flight() {
        this.destination = "null";
        this.id = "null";
        this.quantity = 0;
        this.price = 0.0;
    }

    public Flight(String destination, int quantity, Customer user, int size, double price, String date) { // DESTINATION && PRICE
        this.destination = destination;
        this.quantity = quantity;
        this.buyer = user.getName().substring(0,2);
        this.id = this.buyer + this.destination.substring(0,2) + size;
        this.price = price;
        this.date = date;
    }

    public Flight(String destination, double price) {
        this.destination = destination;
        this.price = price;
    }

    public String getDestination() { return this.destination; }
}
