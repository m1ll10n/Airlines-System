package com.company;

public class Admin extends User {

    private String position;

    public Admin(String uName, String password, String position) {
        super(uName, password);
        this.position = position;
    }

    public String getPosition() { return this.position; }
    public void setPosition(String position) { this.position = position; }

    public void menu() {
        System.out.println("Welcome to dashboard, " + getuName());
    }

}