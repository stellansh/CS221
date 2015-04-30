/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d3class;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author stella
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> myInts = new ArrayList<Integer>(25);
        System.out.println("Size of myInts = " + myInts.size());
        for (int k = 0; k < 10; k++) {
            myInts.add(3 * k);//Auto boxing
        }
        myInts.set(6, 44);
        System.out.println("Size of myInts = " + myInts.size());

        int num[] = new int[myInts.size()];
        for (int k = 0; k < myInts.size(); k++) {
            num[k] = myInts.get(k); // Unboxing
            System.out.print(myInts.get(k) + " ");
        }
        myInts.add(null);
        System.out.println("\n" + myInts);
        System.out.println(Arrays.toString(num));
        
    }
}