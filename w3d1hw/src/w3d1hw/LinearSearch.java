/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d1hw;

/**
 *
 * @author stella
 */
class LinearSearch {
    //public static int LinearSearch(int a[], int value) {

    public static void main(String args[]) {
        int[] a = {22, 33, 44, 55, 66, 77, 88, 99};

        System.out.println("search(a, 22): " + linearSearchRecursive(a, 22, 7));
        System.out.println("search(a, 44): " + linearSearchRecursive(a, 43, 7));
        System.out.println("search(a, 77): " + linearSearchRecursive(a, 77, 7));
    }

    public static boolean linearSearchRecursive(int[] a, int key, int Index) {
      

        if (Index < 0) {
            return false;
        }

        if (a[Index] == key) {
            return true;

        }

        return linearSearchRecursive(a, key, Index - 1);

    }
}
/*
search(a, 22): true
search(a, 44): false
search(a, 77): true
*/
