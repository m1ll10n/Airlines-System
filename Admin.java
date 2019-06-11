package com.company;
import java.util.*;

public class Admin extends User {

    private String position;

    public Admin(String uName, String password, String position) {
        super(uName, password);
        this.position = position;
    }

    public String getPosition() { return this.position; }
    public void setPosition(String position) { this.position = position; }

    public int menu() {

        Scanner in = new Scanner(System.in);
        int response;

        System.out.print("Welcome to menu, " + this.getPosition() + "\n**********\n1 - Monitor\n4 - Logout\n**********\n" +
                "Please enter the corresponding number for you choice.\n- ");
        do {

            while (!in.hasNextInt()) {
                System.out.print("Please enter number\n- ");
                in.next();
            }

            response = in.nextInt();

            if (!(response == 1 || response == 4))
                System.out.print("Wrong input\n- ");

        } while (!(response == 1 || response == 4));

        return response;
    }

}
