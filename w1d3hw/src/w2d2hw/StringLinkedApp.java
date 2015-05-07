/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d2hw;

/**
 *
 * @author stella
 */
//public class MyStringLinkedList {
class Node {

    String value;
    Node next;
    Node previous;

    Node(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}
 class MyStringLinkedList {

        Node first;
        Node last;

        MyStringLinkedList() {
            first = null;
            last = null;
        }

        public void addFront(String item) {
            Node newNode = new Node(item);
            if (isEmpty()) {
                first = newNode;
                last = newNode;

            } else {

                newNode.next = first;
                first.previous = newNode;
                first=newNode;

            }

        }

        public boolean isEmpty() {
            return (first == null);
        }

        public void addLast(String item) {
            Node newLink = new Node(item);
            if (isEmpty()) {
                first = newLink;
                last = newLink;
            } else {
                last.next = newLink;
                newLink.previous = last;
                last = newLink;
            }

        }

        public boolean postAddNode(Node n, String s) {

            Node current = first;
            while (!current.value.equals(s)) {
                current = current.next;
                if (current == null) {
                    return false;
                }
            }
            if (current == last) {
                last = n;
                n.previous = current;
                current.next = n;
            } else {
                n.next = current.next;
                current.next.previous = n;
                n.previous = current;
                current.next = n;
            }
            return true;
        }

        public int Size() {
            int count = 0;
            for (Node current = first; current != null; current = current.next) {
                count++;
            }
            return count;
        }

        public boolean preAddNode(Node n, String s) {
            Node current = last;
            while (!current.value.equals(s)) {
                current = current.previous;
                if (current == null) {
                    return false;
                }
            }
            if (current == first) {
                first.previous = n;
                n.next = first;
                first = n;
            } else {
                n.next = current;
                current.previous = n;
                current.previous.next = n.previous;
                n.previous = current.previous.next;
            }
            return true;

        }

        public Node findLast() {
            return last;
        }

        public Node findItem(String str) {
            Node current = first;
            while (current != null) {
                if (current.value.equals(str)) {
                    return current;
                }
                current = current.next;
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

        public void deleteList() {
            first = null;
            last = null;
        }

        public void printReverse() {
            System.out.print("List (last-->first): ");
            Node current = last;
            while (current != null) {
                current.toString();
                current = current.previous;
            }
            System.out.println("");

        }

    }


public class StringLinkedApp {

    public static void main(String[] args) {
        MyStringLinkedList LList= new MyStringLinkedList();

        LList.addFront("stella");
        LList.addFront("Bella");
        LList.addLast("Ciella");
        LList.addLast("Donella");

        LList.postAddNode(new Node("Filla"), "Bella");
        LList.printReverse();
        LList.printReverse();
        //LList.deleteList();
        LList.deleteNode(new Node("Ciella"));
        LList.printReverse();
        LList.findItem("stella").toString();
        System.out.println(LList.Size());
    }
    
}
