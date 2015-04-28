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
public class Dollars {

    public static void main(String[] args) {
        int dollars;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        Scanner input = new Scanner(System.in);
        System.out.println("how much?:");
        double amount = input.nextDouble();
        dollars = (int) amount;
        double cents = amount - dollars;

        quarters = (int) (cents / .25);
        dimes = (int) ((cents - (quarters * .25)) / 0.1);
        nickels = (int) ((cents - (quarters * .25) -(dimes*.1))/ 0.05);
        pennies = (int) (100*(cents - quarters*.25 - dimes *.1- nickels*.05));

        System.out.println("dollars:" + dollars);
        System.out.println("quarters:" + quarters);
        System.out.println("dimes:" + dimes);
        System.out.println("nickels:" + nickels);
        System.out.println("pennies:"+pennies);

    }
}   /*how much?:
   12.34
   dollars:12
   quarters:1
   dimes:0
   nickels:1
   pennies:3*/
