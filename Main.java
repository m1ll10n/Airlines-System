package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        LinkedList users = new LinkedList();
        User cust = new Customer("dew", "dew", "Umar");
        User admin = new Admin("qwe", "qwe", "Administrator");
        User currentUser;
        users.insertAtBack(cust);
        users.insertAtBack(admin);

        // START MENU SCREEN
        int responseMenu;
        int response = admin.splashScreen();
        currentUser = admin.splashRespond(response, users);

        if (response == 3)
            System.exit(0);

        do {
            do {
                responseMenu = currentUser.menu();
            }
            while (!(responseMenu == 4));

            currentUser = admin.splashRespond(admin.splashScreen(), users);
        }
        while (!(currentUser.getuName()).equalsIgnoreCase("null"));
        // END MENU SCREEN
    }
}
