/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d1hw;

//import sun.awt.image.ImageWatched.Link;
/**
 *
 * @author stella
 */
class Link {
// data item
    public int iData;
    public double dData;           
    public Link next;              // next link in list
    // -------------------------------------------------------------

    public Link(int id, double dd) {
        // TODO Auto-generated constructor stub
        iData = id;                 // initialize data
        dData = dd;
    }

    // -------------------------------------------------------------
    public void displayLink()
    {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
}  // end class Link 

public class LinkList {

    private Link first;
    int count=0;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() // true if list is empty
    {
        return (first == null);
    }
      
  
    public void insertFirst(int id, double dd) {                           // make new link
        Link newLink = new Link(id, dd);
        newLink.next = first;       // newLink --> old first
        first = newLink;            
        count++;
     }
    public int size(){
       return count;
     }
    public boolean find(int key){
         Link current=first;
         while (current.next!=null){
            if(current.iData==key){
               return true;
            }
            else{
                 
                current=current.next;
            }
        }
        return false;
    }

    public int greater(){
       Link current=first;
       int tempo=current.iData;
         while (current.next!=null){ 
             if(current.iData>tempo){
                 tempo=current.iData;
             }
              current=current.next;
         }
         return tempo;
    }
     public int smaller(){
       Link current=first;
       int tempo=current.iData;
         while (current.next!=null){ 
             if(current.iData<tempo){
                 tempo=current.iData;
             }
              current=current.next;
         }
         return tempo;
    }
    public Link deleteFirst() // delete first item
    {                           // (assumes list not empty)
        Link temp = first;          // save reference to link
        first = first.next; 
        count--;// delete it: first-->old next
        return temp;                // return deleted link
    }

    
    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;       // start at beginning of list
        while (current != null) // until end of list,
        {
            current.displayLink();   // print data
            current = current.next;  // move to next link
        }
        System.out.println("");
    }
    
 public static void main(String[] args) {
        LinkList num = new LinkList();
        num.insertFirst(10, 1.11);
        num.insertFirst(20, 2.22);
        num.insertFirst(30, 3.33);
        num.insertFirst(42, 4.44);
        num.insertFirst(45, 4.44);
        
        num.displayList();
        System.out.println();
        System.out.println("greatest Integer is: " + num.greater());
        System.out.println("smallest Integer is: " + num.smaller());
        System.out.println("after deleting:"+ num.deleteFirst());
        System.out.println("Size: " + num.size());
        System.out.println("20?: " +num.find(50));
        System.out.println("30?: " + num.find(30));
    }
    
}

/* output:: 
List (first-->last): {42, 4.44} {30, 3.33} {20, 2.22} {10, 1.11} 

greatest Integer is: 42
smallest Integer is: 20
Size: 4
50?: false
30?: true*/