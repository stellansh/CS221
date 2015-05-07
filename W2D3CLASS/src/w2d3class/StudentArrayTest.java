/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3class;

/**
 *
 * @author stella
 */
public class StudentArrayTest {

    public static void main(String[] args) {

        StudentArray<String> arr = new StudentArray<String>(90);
        arr.insert("stishka","dd","dd");
        //arr.insert(40, "plishka", 37);
        //arr.insert(50, "jeeshka", 43);
        //arr.insert(60, "kaishka", 63);
        //arr.insert(70, "laishka", 21);
        StudentArray<Integer> arr2 = new StudentArray<Integer>(90);
          arr2.insert(40, 6, 37);
          
         StudentArray<Character> arr3 = new StudentArray<Character>(90);
        // arr.insert("6jh,"dd","dd");
         
        
        System.out.println("all students info are: ");
        arr.displayAll();

      //  System.out.println("when id 2 is deleted: " + arr.delete(60));

        arr.displayAll();

        System.out.println("student with id 70 is: ");
     //   arr.find(70).displayStudent();

       // System.out.println("maximum value is " + arr.maxMark());

       // System.out.println("minimum value is " + arr.minMark());

    }

}

