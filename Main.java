import java.util.*;
import java.io.*;
import java.text.*;
import javax.swing.*;

public class Main {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    

    ArrayList<Flight> ticketList = new ArrayList<Flight>();
    LinkedList userList = new LinkedList();
    User userdummy = new User("imnirfn", "password123");
    userList.addFirst(userdummy);
    boolean login = false;
    int indexT = 0;

    //read all data from files
    try {
      BufferedReader infile = new BufferedReader(new FileReader("flightlist.txt"));
      //file input of flight tickets
      String[] tempArr;
      String line = infile.readLine();
      int i = -1;
      do {

        tempArr = line.split(";");
        double price = Double.parseDouble(tempArr[1]);
        int quantity = Integer.parseInt(tempArr[2]);
        Flight flight = new Flight(tempArr[0], price, quantity, tempArr[3], tempArr[4]);
        ticketList.add(flight);
        line = infile.readLine();
        //System.out.println(ticketList.toString());
        i++;
      } while(i < ticketList.size());

    } catch (Exception e) {
      //TODO: handle exception
    }

    System.out.println("\n\n\t\t\t\t\tLogin");
    System.out.print("\t\t\t\tUsername: ");
    String username = in.nextLine();

    System.out.print("\t\t\t\tPassword: ");
    String password = in.nextLine();
    
    //login credentials checking
    for(int i = 0; i < userList.size(); i++) {
      User temp;
      temp = (User)userList.get(i);
      if (password.equals(temp.getPassword())) {
        System.out.println("\t\t\t\t\tLogged in");
        login = true;
        indexT = i;
        break; 
      } else if (!password.equals(temp.getPassword()) && i == 2) {
        System.out.println("\t\t\t\tWrong credentials.");
        login = false;
      }
    }
    
    User dummy = (User)userList.get(indexT);
    while(login) {
      System.out.println("\n\n\t\t\t\tWelcome, " + dummy.getUsername());

      //abstraction admin/user dashboard - nnti la implement hehe
      
      System.out.println("\n\t\t\t\t[1]Ticket purchase");
      System.out.println("\t\t\t\t[2]Flight status");
      System.out.println("\t\t\t\t[3]My bookings");
      System.out.println("\t\t\t\t[99]Log out session");
      System.out.print("\n\t\t\t\tInput: ");
      int ans = in.nextInt();

      if (ans == 99) {
        login = false;
        System.out.println("\t\t\t\tSuccessfully logged out.\n\n");
      }

      else if (ans == 2) {
        System.out.print("\033[H\033[2J");
        Flight flightdummy = new Flight();
        flightdummy.searchTicket(ticketList);
      }
    }   
  }
}
