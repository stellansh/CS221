/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author stella
 */
public class Reverse {

public static void main (String[] args){
   Queue<Integer>theQueue = new LinkedList<Integer>(); 
   System.out.println("Please enter the number? ");
   Scanner input = new Scanner(System.in);
   int number = input.nextInt();
       while(number!=0){
        int temp = number%10;
        theQueue.offer(temp);
        number =number/10;
        System.out.print(theQueue.poll());  
}
}
}