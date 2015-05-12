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
public class StringLinkedApp {

    public static void main(String[] args) { 
        StringLinkedList theList = new StringLinkedList();

        theList.addFront("Ananda");

        theList.addFront("Bahati");
        
        theList.addLast("Ciella");
        theList.addLast("Don");
        
        theList.postAddNode(new Node("Fiona"), "Bahati");
        theList.postAddNode(new Node("Gloria"),"Ciella"); 
        theList.preAddNode(new Node("Zai"), "Bahati");
        theList.printReverse();   
        theList.deleteLast();
        theList.printReverse();
        theList.find("Ananda").displayNode();
        System.out.println(theList.size());
    } 
}
