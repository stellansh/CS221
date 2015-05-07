/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d2hw;

import java.util.Arrays;

/**
 *
 * @author stella
 */
public class IntegerArray <T>{

    private T[] theArray;
    private T[] size;

    public void generateRandomArray() {
        for (int i = 0; i <size; i++) {
            theArray[i] = (int) (Math.random()*5);
        }
    }

    public void removeDuplicate() {
        int i;
        int j;
        for ( i = 0; i <size; i++) {
            for ( j = i+1; j < size ; j++) {
                if (theArray[i] == theArray[j]) {
                    deleteIndex(j);
                     j--;
                }
            }

        }
    }

    public void deleteIndex(int index) {

        if (index < size) {

            for (int i = index; i < (size - 1); i++) {

                theArray[i] = theArray[i + 1];

            }

            size--;
           

        }
    }

    public void removeALL() {

        theArray = null;

    }

    public int findsize() {
        return size;
    }

    public int get(int index) {
        if (index < size) {
            return theArray[index];
        } else {

            return -1;

        }
    }
    public int[] getSubList(int first,int last){
        int[] tempo=null;
        if(first<size && last<size){
             int newsize = last - first+1;
            tempo = new int[newsize];
            for (int i=0;i<newsize;i++){
                tempo[i]=theArray[first];
                first++;
            }
        }
        return tempo;
    }
      public void printArray(){
        for (int i = 0; i < size; i++) {
            System.out.print(theArray[i] + ", ");
        }
    }

    public static void main(String[] args) {

        IntegerArray newstrArray = new IntegerArray();
        newstrArray.generateRandomArray();
        newstrArray.printArray();
        System.out.println("Value at Index(9) : " + newstrArray.get(9));
        //newstrArray.removeDuplicate();
        System.out.println("with no duplication ");
        newstrArray.printArray();
        System.out.println("");
        System.out.println("SUB : " );
        int[] sub =newstrArray.getSubList(2,4);
        System.out.println("sub" + Arrays.toString(sub));
    }}
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
}    
        
        
        
    
    

