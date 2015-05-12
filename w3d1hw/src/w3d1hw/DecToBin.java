/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d1hw;

import java.util.Scanner;

/**
 *
 * @author stella
 */
public class DecToBin {

    public static void main(String[] args) {

        int input;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number to convert to binary: ");
        input = scan.nextInt();
        convertToBinary(input);

    }

    public static void convertToBinary(int number) {
        if(number==0|| number==1){
               System.out.print(number);
        }
        
        
      
        else if (number > 0) {
             System.out.print(number % 2);
            
            convertToBinary(number / 2);
            
           
        }

      
    }
}
/*Enter number to convert to binary: 56789
1010101110111011*/