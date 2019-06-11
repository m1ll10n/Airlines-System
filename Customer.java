package com.company;

import java.util.*;

public class Customer extends User {

    private String name;
    private Queue flightHistory;

    public Customer() {
        super();
        flightHistory = new Queue();
        this.name = "null";
    }

    public Customer(String uName, String password, String name) {
        super(uName, password);
        this.name = name;
        flightHistory = new Queue();
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public int menu() {

        Scanner in = new Scanner(System.in);
        int response;

        System.out.print("Welcome to menu, " + this.getName() + "\n**********\n1 - Buy Ticket\n2 - View Current Ticket\n3 - Profile\n4 - Logout\n**********\n" +
                "Please enter the corresponding number for you choice.\n- ");
        do {

            while (!in.hasNextInt()) {
                System.out.print("Please enter number\n- ");
                in.next();
            }

            response = in.nextInt();

            if (!(response == 1 || response == 2 || response == 3 || response == 4))
                System.out.print("Wrong input\n- ");

        } while (!(response == 1 || response == 2 || response == 3 || response == 4));

        return response;
    }

    public String toString() {
        return (this.getName());
    }
}
