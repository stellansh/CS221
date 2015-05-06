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
public class NodeStructure {

    public static void main(String[] args) {
        Node4 N1 = new Node4(10);
        Node4 N2 = new Node4(20);
        Node4 N3 = new Node4(30);
        Node4 X = new Node4(25);
        N1.next = N2;
        N2.prev = N1;
        N2.next = N3;
        N3.prev = N2;
        N2.next = X;
        X.prev = N2;
        N3.prev = X;
        X.next=N3;
        
        Node4 current=N1;
        
        while( current != null) {
           
            current.displayList();
             current = current.next;
           
       
        }

    }
}
