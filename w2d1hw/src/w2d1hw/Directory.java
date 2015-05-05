/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d1hw;

/**
 *
 * @author stella
 */
public class Directory {

    String name;
    long pno;
    Directory next;

    public Directory(String name, long pno) {
        this.name = name;
        this.pno = pno;
    }

    public void displayDirectory() {
        System.out.println("{" + name + "," + pno + "} ");
    }

    class DirectoryOpr {

        private Directory first;
        private Directory last;

        public DirectoryOpr() {
            first = null;
            last = null;
        }

        public boolean isEmpty() {
            if (first == null && last == null) {
                return true;
            } else {
                return false;
            }
        }

        public void insertFirst(String name, long pno) {
            Directory newDire = new Directory(name, pno);
            if (isEmpty()) {
                newDire.next = first;
                first = newDire;
            }
        }

        public void insertLast(String name, long pno) {

            Directory newDire = new Directory(name, pno);
            if (isEmpty()) {
                first = newDire;
            } else {
                last.next = newDire;
                last = newDire;
            }
        }

        public Directory deleteFirst() {
            Directory temp = first;
            if (first.next == null) {
                last = null;
            }
            first = first.next;
            return temp;
        }

        public int size() {
            int size = 0;
            Directory current = first;
            while (current != null) {
                current = current.next;
                size++;
            }
            return size;
        }

        public void displayList() {
            Directory current = first;
            while (current != null) {
                current.displayDirectory();
                current = current.next;
            }
        }

        public Directory find(String key) {
            Directory current = first;
            while (current != null) {
                if (current.name == key) {
                    return current;
                }
                current = current.next;
            }
            return null;
        }
        //public static void main(String[] args) {
    }
    
}
