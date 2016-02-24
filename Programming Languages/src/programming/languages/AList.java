/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.languages;

/**
 *
 * @author stella
 */
import java.util.function.*;

public class AList<T> {

    public final T head;
    public final AList<T> tail;

    private AList(T first, AList<T> rest) {
	this.head = first;
	this.tail = rest;
    }

    // factory method
    public static <T> AList<T> insert(T first, AList<T> list) {
	return new AList<T>(first, list);
    }
    public AList<T> append(AList<T> list) {
	return ( (tail == null)?
		 insert(head, list)
		 : insert(head, tail.append(list))
		 );
    }
    @Override
    public String toString() {
	return  toString(new StringBuilder("[" + this.head), this.tail);
    }
    public static <T> AList<T> concat(AList<T> list1, 
				      AList<T> list2) {
	return list1.append(list2);
    }

    public <R> AList<R> map(Function<? super T,? extends R> fun) {
	return map(fun, this); // needed to capture the wildcard (? extends R)
    }
    public AList<T> filter(Predicate<? super T> pred) {
	return filter(pred, this);  // simplifies the code, fewer branches
    }
    public T reduce(BinaryOperator<T> bop) {
	return reduce(this.head, bop, this.tail); // for iteration and reuse
    }
    public T reduce(T identity, BinaryOperator<T> bop) {
	return reduce(identity, bop, this); // for reuse
    }


    // private static helper functions
    private static <T> String toString(StringBuilder sb, AList<T> list) {
	return (list==null)? 
	    sb.append("]").toString()  : 
	    toString(sb.append(", "+list.head), list.tail) ;
    }
    private static <T,R> AList<R> map(Function<? super T,? extends R> fun,
				      AList<T> list) {
	return ( (list == null)? null
		 : insert(fun.apply(list.head), map(fun, list.tail))
		 );
    }
    private static <T> AList<T> filter(Predicate<? super T> pred, 
				       AList<T> list) {
	return ( (list == null)? null
		 : ( pred.test(list.head)? 
		     insert(list.head, filter(pred, list.tail))
		     : filter(pred, list.tail)
		     )
		 );
    }
    private static <T> T reduce(T elem, 
				BinaryOperator<T> bop, 
				AList<T> lst) {
	return (lst == null)?  elem : 
	    reduce(bop.apply(elem, lst.head), bop, lst.tail);
    }
}
