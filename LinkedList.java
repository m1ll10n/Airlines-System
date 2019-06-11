
package com.company;

import java.util.*;

public class LinkedList {

    private Node first;
    private Node last;
    private Node current;
    private String name; // to label the list
    private User data;

    public LinkedList(String s){

        name = s;
        first = last = current = null;
    }

    public LinkedList(){
        this("null");
    }

    public boolean credentialCheck(String uName, String password, User user) {

        if ((user.getuName().equals(uName)) && (user.getPassword().equals(password))) {
            System.out.print("Logged in!");
            return true;
        }
        else {
            System.out.print("Wrong credentials!");
            return false;
        }
    }

    public void insertAtFront(Object insertItem){

        if (isEmpty())
            first = last = new Node(insertItem);
        else
            first = new Node(insertItem, first);
    }

    public void insertAtBack(Object insertItem){

        if (isEmpty())
            first = last = new Node(insertItem);
        else
            last = last.next = new Node(insertItem);
    }

    public Object removeFromFront() throws EmptyListException{

        Object removeItem = null;

        if(isEmpty())
            throw new EmptyListException(name);

        removeItem = first.data;

        if (first.equals(last))

            first = last = null;
        else

            first = first.next;

        return removeItem;
    }

    public Object removeFromBack() throws EmptyListException{

        Object removeItem = null;

        if(isEmpty())
            throw new EmptyListException(name);

        removeItem = last.data;

        if (first.equals(last))

            first = last = null;
        else {

            Node current = first;

            while(current.next != last)
                current = current.next;

            last = current;
            current.next = null;
        }
        return removeItem;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public Object getFirst(){

        if (isEmpty())

            return null;
        else{

            current = first;
            return current.data;
        }
    }

    public Object getNext(){

        if(current != last){

            current = current.next;
            return current.data;
        }
        else
            return null;
    }

    private int size(Node node) {
        if (node == null)
            return 0;

        return 1 + size(node.next);
    }

    public int getSize() {
        return size(first);
    }

    public User logIn(LinkedList users) {

        Scanner in = new Scanner(System.in);

        System.out.print("LOGIN\n********\nUsername: ");
        String username = in.nextLine();
        System.out.print("Password: ");
        String password = in.nextLine();

        User temp = (User)users.getFirst();
        User current = new Customer();

        while (temp != null) { //CREDENTIALS CHECK

            if (temp.getuName().equals(username) && temp.getPassword().equals(password)){
                System.out.print("Logged in!\n");
                current = temp;
                break;
            }

            temp = (User)users.getNext();

            if (temp == null) {
                System.out.print("Wrong username/password!\n");
                this.logIn(users);
            }
        }
        return current;
    }

    public User register() {

        Scanner in = new Scanner(System.in);

        System.out.print("REGISTER\n********\nUsername: ");
        String regUsername = in.nextLine();
        System.out.print("Password: ");
        String regPassword = in.nextLine();
        System.out.print("Name: ");
        String regName = in.nextLine();

        User regCust = new Customer(regUsername, regPassword, regName);
        System.out.print("Successfully registered!");
        return regCust;
    }
}

