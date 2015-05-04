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
public class Deque {

    private int maxSize;
    private long[] queArr;
    private int front;
    private int rear;
    private int nItems;

    public Deque(int s) {
        maxSize = s;
        queArr = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insertRight(long j) {
        if (rear == maxSize-1) {
            rear = -1;
        }
        queArr[++rear] = j;
        nItems++;
    }

    public void insertLeft(long j) {
        if (rear == maxSize-1) {
            rear = -1;
        }
        for(int i=1;i<rear;i++){
            queArr[i]= queArr[i+1];
        }
        queArr[0] = j;
        nItems++;
    }
     public long removeRight() {
        long temp = queArr[++rear];
        if (rear == maxSize-1) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long removeLeft() {
        long temp = queArr[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long peekFront() {
        return queArr[front];
    }
    public boolean isEmpty() 
    {
        return (nItems == 0);
    }
    public boolean isFull()
    {
        return (nItems == maxSize);
    }

    public int size() 
    {
        return nItems;
    }
}
 class DequeApp {

    public static void main(String[] args) {
        Deque theDeque = new Deque(10);  
        theDeque.insertRight(10);            
        theDeque.insertRight(20);
        theDeque.insertRight(30);
        System.out.println("Front  after inserting on right: " + theDeque.peekFront());
        System.out.println("Size of Queue : " + theDeque.size());
        theDeque.insertLeft(40);
        theDeque.insertLeft(50);
        System.out.println("Front after 2 items inserted on left: " + theDeque.peekFront());
        System.out.println("Size : " + theDeque.size());
        theDeque.removeRight();  
        theDeque.removeRight();
        System.out.println("Size : " + theDeque.size());
        System.out.println("Front: " + theDeque.peekFront());

    }  
}