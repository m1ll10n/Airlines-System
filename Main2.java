package com.company;

public class Main2 {

    public static void main(String[] args) {

        Queue unsorted = new Queue();
        Queue small = new Queue();
        Queue same = new Queue();
        Queue big = new Queue();
        Queue temp = new Queue();

        unsorted.enqueue(2);
        unsorted.enqueue(7);
        unsorted.enqueue(1);
        unsorted.enqueue(5);

        // FIRST SORT
        int data = (Integer) unsorted.dequeue();
        while (!unsorted.isEmpty()) {

            int compare = (Integer) unsorted.dequeue();

            if (data < compare)
                big.enqueue(compare);
            else if (data > compare)
                small.enqueue(compare);
            else if (data == compare)
                same.enqueue(compare);
        }
        // END FIRST SORT
        if (big.size() > 0) {
            int current = (Integer) big.dequeue();
            int next = (Integer) big.dequeue();

            if (current > next) {
                temp.enqueue(next);
                temp.enqueue(current);
            }

            while (!temp.isEmpty())
                big.enqueue(temp.dequeue());
        }

        /*if (small.size() > 0) {
            while (!small.isEmpty()) {
                int current = (Integer) small.dequeue();
                int next = (Integer) small.dequeue();

                if (current > next) {
                    temp.enqueue(next);
                    temp.enqueue(current);
                }
            }
            while (!temp.isEmpty())
                small.enqueue(temp.dequeue());
        }*/

        // REINSERTING QUEUE
        while (!small.isEmpty())
            unsorted.enqueue(small.dequeue());
        unsorted.enqueue(data);
        while (!same.isEmpty())
            unsorted.enqueue(same.dequeue());
        while (!big.isEmpty())
            unsorted.enqueue(big.dequeue());
        // END REINSERTING QUEUE

        while (!unsorted.isEmpty())
            System.out.print(unsorted.dequeue() + " ");
    }
}
