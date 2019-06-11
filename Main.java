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

        // START SPLASH SCREEN
        int response = admin.splashScreen();
 
        if (response == 1)
            currentUser = users.logIn(users);
        else if (response == 2) {
            users.insertAtBack(users.register());
            currentUser = users.logIn(users);
        }
        else {
            System.out.println("Bye bye!");
            currentUser = new Customer(); // TO REMOVE ERROR IN METHOD CALL
            System.exit(0);
        }
        // END SPLASH SCREEN

        //START MENU PAGE
        currentUser.menu();
        //END MENU PAGE
    }
}