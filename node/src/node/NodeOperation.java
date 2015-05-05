/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node;

/**
 *
 * @author stella
 */
class Node1 {

    String name;
    Node1 next;

    Node1(String name) {
        this.name = name;
    }

    public void displayList() {
        System.out.println("{" + name + "}");
    }
}

public class NodeOperation {

    private Node1 first;

    public NodeOperation() {
        first = null;
    }

    public boolean isEmpty() { // true if no links

        return first == null;
    }

    public void insertFirst(String s) // insert at front of list
    {
        Node1 newLink = new Node1(s);
        newLink.next = first;
        first = newLink;
    }

    public Node1 deleteFirst() // delete first item
    {                           // (assumes list not empty)
        Node1 tempo = first;          // save reference to link
        first = first.next;         // delete it: first-->old next
        return tempo;                // return deleted link
    }

    public void displayall() {

        Node1 current = first;

        while (current != null) {
            current.displayList();

            current = current.next;  // move to next link
        }
    }
       // System.out.println("");
}
