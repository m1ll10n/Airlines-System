package com.company;

import java.util.*;

public abstract class User {

    private String uName;
    private String password;

    public User() {
        this.uName = "null";
        this.password = "null";
    }

    public User(String uName, String password) {
        this.uName = uName;
        this.password = password;
    }

    public String getuName() { return this.uName; }
    public String getPassword() { return this.password; }

    public void setuName(String uName) { this.uName = uName; }
    public void setPassword(String password) { this.password = password; }

    public int splashScreen() {

        Scanner in = new Scanner(System.in);
        int response;

        System.out.print("WELCOME TO THE SYSTEM\n*********\nPlease choose '1' to Log In or '2' to Register or '3' to Exit\n- ");

        do {

            while (!in.hasNextInt()) {
                System.out.print("Please enter number\n- ");
                in.next();
            }

            response = in.nextInt();

            if (!(response == 1 || response == 2 || response == 3))
                System.out.print("Wrong input\n- ");

        } while (!(response == 1 || response == 2 || response == 3));

        return response;
    }

    public abstract void menu();

    public String toString() {
        return (getuName() + " " + getPassword());
    }

}