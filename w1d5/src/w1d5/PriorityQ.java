/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d5;

/**
 *
 * @author stella
 */
class PriorityQ {

    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQ(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        if (nItems == maxSize) {
            System.out.println("Stack full");
        } else {
            queArray[nItems++] = item;
        }
    }

    public void display() {
        for (int i = 0; i < nItems; i++) {
            System.out.print(queArray[i] + ",");

        }
        System.out.println("");
    }

    public long remove(long item) {
        int i;
        if (nItems == 0) {
            return -1;
        } else {
            for (i = 0; i < nItems; i++) {
                if (queArray[i] == item) {
                    break;
                }
            }
            if (i == nItems) {
                return -1;
            } else {

                for (int k = i; k < nItems - 1; k++) {
                    queArray[k] = queArray[k + 1];
                }
            }
        }
        nItems--;
        return queArray[i];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}

 