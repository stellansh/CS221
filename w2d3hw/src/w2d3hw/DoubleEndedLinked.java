/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3hw;

/**
 *
 * @author stella
 */
class Link1<T> {

    public T dData;                 // data item
    public Link1 next;                  // next link in list
//-------------------------------------------------------------

    public Link1(T d) // constructor
    {
        dData = d;
    }
//-------------------------------------------------------------

    public void displayLink() // display this link
    {
        System.out.print(dData + " ");
    }
//-------------------------------------------------------------
}  // end class Link
////////////////////////////////////////////////////////////////

class FirstLastList<T> {

    private Link1 first;               // ref to first link
    private Link1 last;                // ref to last link
//-------------------------------------------------------------

    public FirstLastList() // constructor
    {
        first = null;                  // no links on list yet
        last = null;
    }
//-------------------------------------------------------------

    public boolean isEmpty() // true if no links
    {
        return first == null;
    }
//-------------------------------------------------------------

    public void insertFirst(T dd) // insert at front of list
    {
        Link1 newLink = new Link1(dd);   // make new link

        if (isEmpty()) // if empty list,
        {
            last = newLink;             // newLink <-- last
        }
        newLink.next = first;          // newLink --> old first
        first = newLink;               // first --> newLink
    }
//-------------------------------------------------------------

    public void insertLast(T dd) // insert at end of list
    {
        Link1 newLink = new Link1(dd);   // make new link
        if (isEmpty()) // if empty list,
        {
            first = newLink;            // first --> newLink
        } else {
            last.next = newLink;        // old last --> newLink
        }
        last = newLink;                // newLink <-- last
    }
//-------------------------------------------------------------

    public T deleteFirst() // delete first link
    {                              // (assumes non-empty list)
        T temp = (T)first.dData;
        if (first.next == null) // if only one item
        {
            last = null;                // null <-- last
        }
        first = first.next;            // first --> old next
        return temp;
    }

//-------------------------------------------------------------
    public void displayList() {
        System.out.print("List (first-->last): ");
        Link1 current = first;          // start at beginning
        while (current != null) // until end of list,
        {
            current.displayLink();      // print data
            current = current.next;     // move to next link
        }
        System.out.println("");
    }
//-------------------------------------------------------------
}  // end class FirstLastList
////////////////////////////////////////////////////////////////

class FirstLastApp {

    public static void main(String[] args) {                              // make a new list
        FirstLastList<Integer> theList = new FirstLastList<Integer>();

        theList.insertFirst(22);       // insert at front
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);        // insert at rear
        theList.insertLast(33);
        theList.insertLast(55);

        theList.displayList();         // display the list
        theList.deleteFirst();         // delete first two items
        theList.displayList();         // display again
    }  // end main()
}  // end class FirstLastApp
