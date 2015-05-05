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
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
public String toString(){
    String temp="";
    return temp+data;
}
   // public static void main(String[] args) {
    // TODO code application logic here
    //}

}
