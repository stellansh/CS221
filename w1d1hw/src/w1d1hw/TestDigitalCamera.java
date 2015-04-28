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
public class TestDigitalCamera {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
         System.out.println("what brand?;");
        String brand1 = input1.next();
        Scanner input2 = new Scanner(System.in);
        System.out.println("what megapixel?;");
        int megapixels = input2.nextInt();
        DigitalCamera c1 = new DigitalCamera("canon",3);
        DigitalCamera c2 = new DigitalCamera("olympus",21);
        DigitalCamera c3 = new DigitalCamera("Apple",6);
        DigitalCamera c4 = new DigitalCamera("samsung",56);
        c1.DisplayDetails();
        c2.DisplayDetails();
        c3.DisplayDetails();
        c4.DisplayDetails();
        }
}/*what brand?;
canon
what megapixel?;
13
Brand:canon
Megapixel:3
Price:99
Brand:olympus
Megapixel:21
Price:129
Brand:Apple
Megapixel:6
Price:99
Brand:samsung
Megapixel:56
Price:129*/
