/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d3hw;

import w1d3hw.StudentArray;

/**
 *
 * @author stella
 */
public class StudentArrayTest {

    public static void main(String[] args) {

        StudentArray arr = new StudentArray(90);
        arr.insert(30, "stishka", 24);
        arr.insert(40, "plishka", 37);
        arr.insert(50, "jeeshka", 43);
        arr.insert(60, "kaishka", 63);
        arr.insert(70, "laishka", 21);
        System.out.println("all students info are: ");
        arr.displayAll();

        System.out.println("when id 2 is deleted: " + arr.delete(60));

        arr.displayAll();

        System.out.println("student with id 70 is: ");
        arr.find(70).displayStudent();

        System.out.println("maximum value is " + arr.maxMark());

        System.out.println("minimum value is " + arr.minMark());

    }

}
