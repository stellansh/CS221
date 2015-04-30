/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d1;

/**
 *
 * @author stella
 */
public class Bonus {
     public static void main(String[] args) {
         int sale = 0;
        
         if(sale<5000){
                System.out.println("no bonus");
                
         }
         else if(sale>5001 && sale<7000){
            int bonus=sale/10;
            System.out.println("satisfactory");
         }
         else if(sale>10000){
         int bonus=sale/35;
         System.out.println("excellent");
     }
}
}