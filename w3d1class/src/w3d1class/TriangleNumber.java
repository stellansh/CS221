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
public class TriangleNumber {
public static void main(String args[])
{
	System.out.println("Triangle Numner for input 3:"+" " + triangle(1));
}
static int triangle(int n)
{
	if(n==1)
        return 1;
     else
        return  ( n + triangle(n-1) );
}

}
