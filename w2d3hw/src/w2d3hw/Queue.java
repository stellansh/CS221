/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3hw;

/**
 *
 * @author stella
 */
//public class W2d3hw {
class Queue<T> {

    private int maxSize;
    private T[] queArray;
    private int front;
    private int rear;
    private int nItems;
//--------------------------------------------------------------

    public Queue(int s) // constructor
    {
        maxSize = s;
        queArray = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
//--------------------------------------------------------------

    public void insert(T j) // put item at rear of queue
    {
        if (rear == maxSize - 1) {        // deal with wraparound
                rear = -1;
                  }
            queArray[++rear] = j;         // increment rear and insert
            nItems++;                     // one more item
        }
    
//--------------------------------------------------------------

    public T remove() // take item from front of queue
    {
        T temp = queArray[front++]; // get value and incr front
        if (front == maxSize) // deal with wraparound
        {
            front = 0;
        }
        nItems--;                      // one less item
        return temp;
    }
//--------------------------------------------------------------

    public T peekFront() // peek at front of queue
    {
        return queArray[front];
    }
//--------------------------------------------------------------

    public boolean isEmpty() // true if queue is empty
    {
        return (nItems == 0);
    }
//--------------------------------------------------------------

    public boolean isFull() // true if queue is full
    {
        return (nItems == maxSize);
    }
//--------------------------------------------------------------

    public int size() // number of items in queue
    {
        return nItems;
    }
//--------------------------------------------------------------
}  // end class Queue
////////////////////////////////////////////////////////////////

class QueueApp {

    public static void main(String[] args) {
        Queue<Integer> theQueue = new <Integer> Queue(25);  // queue holds 5 items

        theQueue.insert(10);
       // System.out.println("Front of " + theQueue.peekFront());
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        System.out.println("Front of the Queue : " + theQueue.peekFront());
        theQueue.remove();              // remove 3 items
        theQueue.remove();              //    (10, 20, 30)
        theQueue.remove();

        theQueue.insert(50);            // insert 4 more items
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);
        System.out.println("Front of the Queue : " + theQueue.peekFront());
        System.out.println("Size of the Queue : " + theQueue.size());
        while (!theQueue.isEmpty()) // remove and display
        {                            //    all items
            Integer n = theQueue.remove();
            System.out.print(n);
            System.out.print(" ");// que ends.
        }
        System.out.println("");
        System.out.println("Size of the Queue after deleting: " + theQueue.size());
    }  // end main()
}  // end

/*     Front of the Queue : 10
Front of the Queue : 40
Size of the Queue : 5
40 50 60 70 80 
Size of the Queue after deleting: 0*/