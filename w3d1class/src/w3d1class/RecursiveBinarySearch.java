/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d1class;
//wiquiuyuk
/**
 *
 * 
 * @author stella
 */
public class RecursiveBinarySearch {
	public static void main(String args[]) {
		int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
		 
		 System.out.println("search(a, 44): " + binarySearch(a, 44,0,8));
		 System.out.println("search(a, 50): " + binarySearch(a, 50,0,8));
		 System.out.println("search(a, 77): " + binarySearch(a, 77,0,8));
		
	}

	public static boolean binarySearch(int[] data, int target, int low, int high) {
		if (low > high)
			return false; // interval empty; no match
		else {
			int mid = (low + high) / 2;
			if (target == data[mid])
				return true; // found a match
			else if (target < data[mid])
				return binarySearch(data, target, low, mid - 1); // recur left of the middle
			else
				return binarySearch(data, target, mid + 1, high); // recur right of the middle
		}
	}
}//return binarySearch data, target and then change the video of my names
