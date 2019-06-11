package com.company;

public class Node {

    Object data;
    Node next;

    Node(Object o){

        this(o,null);
    }

    Node(Object o, Node next){
        data = o;
        this.next = next;
    }

    Object getData(){
        return data;
    }

    Node getLink(){
        return next;
    }
}