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
        String brand1 = input1.next();
        Scanner input2 = new Scanner(System.in);
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
}
