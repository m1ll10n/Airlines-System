import java.util.*;
import java.io.*;

public class Flight {
  private String id;
  private double price;
  private int quantity;
  private String destination;
  private String date;

  public Flight() {
    this.id = null;
    this.price = 0;
    this.quantity = 0;
    this.destination = null;
    this.date = null;
  }
  public Flight(String id, double p, int q, String d, String date) {
    this.id = id;
    this.price = p;
    this.quantity = q;
    this.destination = d;
    this.date = date;
  }

  public String getId() {
    return id;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getDestination() {
    return destination;
  }

  public String getDate() {
    return date;
  }

  public String toString() {
    return "\n\t\t\t\tFlight id : " + id + "\n\t\t\t\tTicket price : RM " + price + "\n\t\t\t\tTicket Available : " + quantity + "\n\t\t\t\tFlight Destination : " + destination + "\n\t\t\t\tFlight Date : " + date;
  }

  public void searchTicket(ArrayList<Flight> flight) {
    Scanner in = new Scanner(System.in);
    Flight dummy;

    System.out.print("\n\t\t\t\tSearch destination: ");
    String ans = in.nextLine();
    for (int i = 0; i < flight.size(); i++) {
      dummy = (Flight)flight.get(i);
      //System.out.println(dummy.toString());

      if(dummy.getDestination().equalsIgnoreCase(ans)) {
        System.out.println(dummy.toString());
      }
    }
  }
}
