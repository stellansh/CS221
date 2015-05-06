/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d2;

/**
 *
 * @author stella
 */
class Node4 {

    int data;
    Node4 prev;
    Node4 next;

    Node4(int data) {
        this.data = data;
    }

    public void displayList() {
        System.out.println("{" + data + "}");
    }
}

class DoubleNodes {

    private Node4 first;
    private Node4 last;

    public DoubleNodes() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node4 N1 = new Node4(data);
        if (isEmpty()) {
            first = N1;
        } else {
            first.prev = N1;
            N1.next = first;
        }
        first = N1;
    }

    public void insertLast(int data) {
        Node4 N3 = new Node4(data);
        if (isEmpty()) {
            first = N3;
        } else {
            last.next = N3;
            N3.prev = last;
        }
        last = N3;
    }

    public Node4 deletefirst() {
        Node4 temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.prev = null;
            first = first.next;

        }
        return temp;
    }

    public Node4 deletelast() {
        Node4 temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.prev.next = null;
            last = last.prev;

        }
        return temp;
    }
//    public int find(int dat) {
//            Node4 current = first;
//            while (current != null) {
//                if (current.data== dat) {
//                    return 
//                }else{
//                    
//                }
//                current = current.next;
//            }
//            return null;

    public void insertafter(int temp, int key) {

        //current=first
        //current.next
        Node4 current = first;
        while (current != null) {
            if (current.data == temp) {
                Node4 X = new Node4(key);
                current.next = X;
                X.prev = current;
                current.next.prev = X;
                X.next = current.next;
               // ...........
                break;
            }else{
            current = current.next;
            }
        }
       

    }
    public void display(){
        Node4 current =first;
        while(current!=null){
            current.displayList();
            current = current.next;
        }
        System.out.println("");
    }
}

public class DoubleNodeApp {

    public static void main(String[] args) {
        DoubleNodes newLink = new DoubleNodes();
        newLink.insertLast(20);
        newLink.insertLast(30);
        newLink.insertLast(40);
        newLink.display();
        newLink.insertafter(20, 25);
        newLink.display();
        

    }

}
