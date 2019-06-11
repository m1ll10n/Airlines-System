package com.company;

public class Customer extends User {

    private String name;

    public Customer() {
        super();
        this.name = "null";
    }

    public Customer(String uName, String password, String name) {
        super(uName, password);
        this.name = name;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public void menu() {
        System.out.println("Welcome to menu, " + this.getName());
    }

    public String toString() {
        return (this.getName());
    }
}