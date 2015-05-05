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
public class PhoneDirectoryApp {
    
    
    public static void main(String[] args){
       DirectoryOpr pD = new DirectoryOpr();
        pD.insertFirst("a", 23534344);
        pD.insertFirst("b", 78734342);
        pD.insertLast("c", 128834342);
        pD.insertLast("d", 323484342);
        pD.displayList();
        System.out.println("Size: " + pD.size());
        System.out.println(pD.find("c"));
        System.out.println("Delete first: " + pD.deleteFirst());
        
    }
}

