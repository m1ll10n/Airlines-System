package com.company;

public class Queue {

    private LinkedList list;

    public Queue() {
        list = new LinkedList();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.getSize();
    }

    public void enqueue(Object e) {
        list.insertAtBack(e);
    }

    public Object dequeue() {
        return list.removeFromFront();
    }

    public Object front() {
        return list.getFirst();
    }
}
