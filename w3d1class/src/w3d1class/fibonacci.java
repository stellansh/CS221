/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d1class;

/**
 *
 * @author stella
 */
public class fibonacci {
    
     public static int fibo(int n){
        if(n == 1 || n == 2){
            return 1;
        }
 
        return fibo(n-1) + fibo(n -2); 
    }
}
