/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author stella
 */
//public class  StringLinkedList{

  class Node {

    String value;
    Node next;
    Node previous;

    public Node(String value) {
        this.value = value;
    }

    public void displayNode() {
        System.out.print(value + " ");
    }
}

class StringLinkedList {

    Node first;
    Node last;

    StringLinkedList() {
        first = null;
        last = null;
    }
 public void addFront(String value) {
        Node newLink = new Node(value);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;

    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void addLast(String value) {
        Node newLink = new Node(value);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }
public boolean postAddNode(Node n, String str) {
        Node current = first;
        while (!current.value.equals(str)) {
            current =current.next;
            if(current==null){
                return false;
            }
        }
        if (current==last){
            last = n;
            n.previous=current;
            current.next=n;
        }
        else {
            n.next = current.next;
            current.next.previous=n;
            n.previous=current;
            current.next = n;
        }
        return true;
    }
    public int size() {
        int count = 0;
        for (Node current = first; current != null; current = current.next) {
            count++;
        }
        return count;
    }
    public boolean preAddNode(Node n, String str) {
        Node current = last;
        while (!current.value.equals(str)) {
            current =current.previous;
            if(current==null){
                return false;
            }
        }
        if (current==first){
            first.previous=n;
            n.next=first;
            first=n;
        }
        else {
            n.next = current;
            current.previous=n;
            current.previous.next=n;
            n.previous= current.previous;
        }
        return true;
        
    }

    public Node findLast() {
        return last;
    }

    public Node find(String str) {
        for (Node current = first; current != null; current = current.next) {
            if (current.value.equals(str)) {
                return current;
            }
        }
        return null;
    }
  public void deleteNode(Node n) {
        Node current = first;
        while (current != null) {
            if (n.value.equals(current.value)) {
                current.previous.next = current.next.previous;
                current.next.previous = current.previous.next;
            }
            current = current.next;
        }
    }

    public void deleteLast() {
        Node temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
    }
  public void printReverse() {
        System.out.print("List (last-->first): ");
        Node current = last;
        while (current != null) {
            current.displayNode();
            current = current.previous;
        }
        System.out.println("");

    }
}

