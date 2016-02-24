/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.languages;

import java.util.function.BiFunction;

/**
 *
 * @author stella
 */
public class Main {
    public static void main(String[] args) {
	BiFunction<Long, AList<Long>, AList<Long>> cons = AList::insert;

	AList<Integer> iList = AList.insert(5, null);
	System.out.println(iList);
	iList = AList.insert(4, iList);
	iList = AList.insert(1, AList.insert(2, AList.insert(3, iList)));
	System.out.println(iList);
	AList<Integer> iListPlus1 = iList.map(x->x+1);
	System.out.println(iListPlus1);
	System.out.println("count="+count(5, iList)); // output: 1
	System.out.println("lists are unchanged");
	printAList(iList); // note the list is unchanged
	printAList(iListPlus1);
	Integer[] arr = {5,4,3,2,1,6,5,4,3,3,2};
	AList<Integer> iList2 = array2list(arr);
	System.out.println(iList2);
	AList<Integer> iList3 = iList2.map(x -> x-1);
	System.out.println(iList3 + "  map of x-1");
	System.out.println(iList2 + "  unchanged");
	AList<Integer> iList4 = iList2
	    .filter(x -> x>=3)
	    .map(x -> x-1);
	printAList(iList2);
	System.out.println("filter x>= 3, map x-1");
	printAList(iList4);
    }

    public static <T> AList<T> array2list(T[] arr) {
	return array2list(arr, arr.length-1, null);  // needed for iteration
    }
    private static <T> AList<T> array2list(T[] arr, int index, AList<T> list) {
	return ( index < 0?
		 list 
		 : AList.insert(arr[index], array2list(arr, index-1, list))
		 );
    }
		 

    public static <T> int count(T elem, AList<T> list) {
	    return ( list==null? 0 
		     : ( elem==list.head? 
			 1+count(elem, list.tail) 
			 : count(elem, list.tail)
			 )
		     );
    }
    public static <T> void forEach(Consumer<? super T> fun, AList<T> lst) {
	if (lst != null) {
	    fun.accept(lst.head);
	    forEach(fun, lst.tail);
	}
    }
    public static <T> void printAList(AList<T> lst) {
	System.out.print("[ ");
	Consumer<T> fun = x-> System.out.print(x + " ");
	forEach(fun, lst);
	System.out.println("]");
    }
}