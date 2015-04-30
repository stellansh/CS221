/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d3class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author stella
 */
public class Array1sort {

// Demo code to sort the elements
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<String>(Arrays.asList("Hello", "Welcome",
                "Java", "Object", "Array", "String", "Inheritance"));//.aslist=assigning is predefined 
        System.out.println("****** Unsorted String Array *******");
        //Sort array in ascending order
        System.out.println(stringArray);

        System.out.println("****** Sorted String Array *******");
        Collections.sort(stringArray);// collections is predefined 
        System.out.println(stringArray);

        //Sort array in reverse order
        Collections.sort(stringArray, Collections.reverseOrder());// predefned`
        System.out.println("****** Reverse Sorted String Array *******");
        System.out.println(stringArray);

    }

}
