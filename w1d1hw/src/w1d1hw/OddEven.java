/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d1hw;

import java.util.Scanner;

/**
 *
 * @author stella
 */
public class OddEven {

    public static void main(String[] args) {

        int number;
        int evenCount = 0;
        int oddCount = 0;
        int zeroCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number > 0) {
            int digit = number % 10;
           
            if (digit == 0) {
                zeroCount++;

            } else if (digit % 2 == 0) {
                evenCount++;

            } else {
                oddCount++;

            }
            number = number / 10;

        }
        System.out.println("odd digits:" + zeroCount);
        System.out.println("even digits:" + evenCount);
        System.out.println("zero digits:" + zeroCount);
    }
}
