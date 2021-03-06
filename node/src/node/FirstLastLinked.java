/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node;

/**
 *
 * @author stella
 */
class Link13 {

    public long dData;                 // data item
    public Link13 next;                  // next link in list
//-------------------------------------------------------------

    public Link13(long d) // constructor
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

class FirstLastLinked {

    private Link13 first;               // ref to first link
    private Link13 last;                // ref to last link
//-------------------------------------------------------------

    public FirstLastLinked() // constructor
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

    public void insertFirst(long dd) // insert at front of list
    {
        Link13 newLink = new Link13(dd);   // make new link

        if (isEmpty()) // if empty list,
        {
            last = newLink;             // newLink <-- last
        }
        newLink.next = first;          // newLink --> old first
        first = newLink;               // first --> newLink
    }
//-------------------------------------------------------------

    public void insertLast(long dd) // insert at end of list
    {
        Link13 newLink = new Link13(dd);   // make new link
        if (isEmpty()) // if empty list,
        {
            first = newLink;            // first --> newLink
        } else {
            last.next = newLink;        // old last --> newLink
        }
        last = newLink;                // newLink <-- last
    }
//-------------------------------------------------------------

    public long deleteFirst() // delete first link
    {                              // (assumes non-empty list)
        long temp = first.dData;
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
        Link13 current = first;          // start at beginning
        while (current != null) // until end of list,
        {
            current.displayLink();      // print data
            current = current.next;     // move to next link
        }
        System.out.println("");
    }
//-------------------------------------------------------------
}
