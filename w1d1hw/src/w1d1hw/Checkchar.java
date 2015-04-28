/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d1hw;

import static java.lang.System.in;

import java.util.Scanner;

/**
 *
 * @author stella
 */
public class Checkchar {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give me a character:");
        char chr = input.next().charAt(0);
        //char chr =(char)system.in.read();
        int c = (int) chr;
        if (c>=48 && c <= 57) {
            System.out.println("it is a number");
        } else if (c>=65 && c <= 90) {
            System.out.println("it is uppercase");
         } else if (c>=97 && c <= 122) {
            System.out.println("it is lowercase");
        }else{
              System.out.println("its a special one");
         }
             

    }

}     
/* give me a character:
1234
It is a number

give me a character:
A
it is uppercase */
