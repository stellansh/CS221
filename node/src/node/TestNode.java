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
public class TestNode {

    public static void main(String[] args) {
        Node start = new Node(0);

        //System.out.println(start);
        String[] arr = {"java", "DS", "discrete", "c#", "python"};
        int a[] = {10, 20, 30, 40, 50};
        Node current = start;
        for (int i = 0; i < a.length; i++) {
            current.next = new Node(a[i]);
            current = current.next;
        }
        int count = 0;
        for (current = start; current != null; current = current.next) {
            count++;
            System.out.println(current);
        }
    }
}
