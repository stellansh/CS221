/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d4hw;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author stella
 */
class StackX {

    private int maxSize;        // size of stack array
    private long[] stackArray;
    private int top;            // top of stack
//--------------------------------------------------------------

    public StackX(int s) // constructor
    {
        maxSize = s;             // set array size
        stackArray = new long[maxSize];  // create array
        top = -1;                // no items yet
    }

//--------------------------------------------------------------
    public void push(long j) // put item on top of stack
    {
        stackArray[++top] = j;     // increment top, insert item
    }

//--------------------------------------------------------------
    public long pop() // take item from top of stack
    {
        return stackArray[top--];  // access item, decrement top
    }

//--------------------------------------------------------------
    public long peek() // peek at top of stack
    {
        return stackArray[top];
    }
//--------------------------------------------------------------

    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }
//--------------------------------------------------------------

    public boolean isFull() // true if stack is full
    {
        return (top == maxSize - 1);
    }

    public int size() {
        return top;
    }

    public boolean clear() {
        return (stackArray == null);
    }

    public boolean find(Long Searchl) {
        int j;
        for (j = 0; j < top; j++) {

            if (stackArray[j] == Searchl) {
                //return a[j];
            }
        }
        if (j == top) {
            return false;
        }

        return true;
    }

    public String toString() {
        String out = "";
        for (int i = top; i >= 0; i--) {
            out = out + stackArray[i] + " ";
        }

        return "[ " + out + "]";
    }

//--------------------------------------------------------------
}  // end class StackX 
////////////////////////////////////////////////////////////////

class StackApp {

    public static void main(String[] args) throws IOException {
        String input;
        StackX stack = new StackX(3);
        StackX obj1 = new StackX(3);
        obj1.push(1);
        obj1.push(2);
        obj1.push(3);
        System.out.println("The first Object :" + obj1);
        StackX obj2 = new StackX(8);
        obj2.push(4);
        obj2.push(5);
        obj2.push(10);
        System.out.println("The second object :" + obj2);
        StackX Merge = merge(obj2, obj1);
        System.out.println("After the two object merge :" + Merge);
        while (true) {

            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter the method u want : ");
                input = in.next();          // read a string from kbd
                if (input.equals("quit")) {       // quit if [Enter]
                    break;
                } else {
                    if (input.equals("push")) {
                        System.out.println("what value?:");
                        Long value = in.nextLong();

                        if (stack.isFull()) {
                            System.out.println("the stack is full:");
                        } else {
                            stack.push(value);
                        }
                    } else if (input.equals("pop")) {
                        if (stack.isEmpty()) {

                            System.out.println("empty stack:");

                        } else {
                            stack.pop();

                        }
                    } else {

                        System.out.println(stack.peek());
                    }
                }

            }
            System.out.println("FINISHED");
            System.out.println(stack.toString()); // this will display the values

        }

    }

    public static StackX merge(StackX A, StackX B) {
        int size1 = A.size();
        int size2 = B.size();
        int size = size1 + size2;
        StackX temp = new StackX(size);
        for (int i = A.size(); i > 0; i--) {
            temp.push(A.pop());
        }
        for (int i = B.size(); i > 0; i--) {
            temp.push(B.pop());
        }
        return temp;
    }
}
