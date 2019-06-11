package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);

        LinkedList users = new LinkedList();
        User cust = new Customer("dew", "dew", "Umar");
        User admin = new Admin("qwe", "qwe", "Administrator");
        User currentUser;

        Flight[] placeNprice = new Flight[5];
        BufferedReader fileFlight = new BufferedReader(new FileReader("placeNprice.txt"));

        String[] tempArr;
        String line = fileFlight.readLine();

        for (int i = 0; i < 5; i++) {
            tempArr = line.split(";");
            double price = Integer.parseInt(tempArr[1]);
            placeNprice[i] = new Flight(tempArr[0], price);
            line = fileFlight.readLine();
        }
        fileFlight.close();
        System.out.print(placeNprice[2].getDestination());

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
