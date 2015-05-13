/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d2hw;

/**
 *
 * @author stella
 */
class Node {

    public int iData;              // data item (key)
    public double dData;           // data item
    public Node leftChild;         // this node's left child
    public Node rightChild;        // this node's right child

    public void displayNode() // display ourself
    {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }
}

class Tree1 {

    private Node root;             // first node of tree
//-------------------------------------------------------------

    public Tree1() // constructor
    {
        root = null;
    }            // no nodes in tree yet
//-------------------------------------------------------------

    public Node find(int key) // find node with given key
    {                           // (assumes non-empty tree)
        Node current = root;               // start at root
        while (current.iData != key) // while no match,
        {
            if (key < current.iData) // go left?
            {
                current = current.leftChild;
            } else // or go right?
            {
                current = current.rightChild;
            }
            if (current == null) // if no child,
            {
                return null;                 // didn't find it
            }
        }
        return current;                    // found it
    }  // end find()
//-------------------------------------------------------------

    public void insert(int id, double dd) {
        Node newNode = new Node();    // make new node
        newNode.iData = id;           // insert data
        newNode.dData = dd;
        if (root == null) // no node in root
        {
            root = newNode;
        } else // root occupied
        {
            Node current = root;       // start at root
            Node parent;
            while (true) // (exits internally)
            {
                parent = current;
                if (id < current.iData) // go left?
                {
                    current = current.leftChild;
                    if (current == null) // if end of the line,
                    {                 // insert on left
                        parent.leftChild = newNode;
                        return;
                    }
                } // end if go left
                else // or go right?
                {
                    current = current.rightChild;
                    if (current == null) // if end of the line
                    {                 // insert on right
                        parent.rightChild = newNode;
                        return;
                    }
                }  // end else go right
            }  // end while
        }  // end else not root
    }  // end insert()
//-------------------------------------------------------------

    void preOrder(Node localRoot) {

        if (localRoot != null) {

            System.out.print(localRoot.iData + " ");

            preOrder(localRoot.leftChild);

            preOrder(localRoot.rightChild);

        }

    }

// -------------------------------------------------------------
    void inOrder(Node localRoot) {

        if (localRoot != null) {

            inOrder(localRoot.leftChild);

            System.out.print(localRoot.iData + " ");

            inOrder(localRoot.rightChild);

        }

    }

// -------------------------------------------------------------
    void postOrder(Node localRoot) {

        if (localRoot != null) {

            postOrder(localRoot.leftChild);

            postOrder(localRoot.rightChild);

            System.out.print(localRoot.iData + " ");

        }

    }

    public Node minimum() // returns node with minimum key value
    {
        Node current;
        Node last;
        last = null;
        current = root; // start at root
        while (current != null) // until the bottom,
        {
            last = current; // remember node
            current = current.leftChild; // go to left child
        }
        return last;
    }

    public Node maximum() // returns node with minimum key value
    {
        Node current;
        Node last;
        last = null;
        current = root; // start at root
        while (current != null) // until the bottom,
        {
            last = current; // remember node
            current = current.rightChild; // go to left child
        }
        return last;
    }

    public int countleafs(Node n) {
        //int count = 0;
        if (n == null) {
            return 0;
        } else if (n.leftChild == null && n.rightChild == null) {
            return 1;
        } else {
            return countleafs(n.leftChild) + countleafs(n.rightChild);
        }

    }

    Node getRoot() {
        return root;

    }
}

//-------------------------------------------------------------




public class BSTDemo2 {

    public static void main(String[] args) {
        Tree1 theTree = new Tree1();
        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.7);
        theTree.insert(12, 1.5);
        theTree.insert(37, 1.2);
        theTree.insert(43, 1.7);
        theTree.insert(30, 1.5);
        Node f = theTree.find(25);
        f.displayNode();
        

        System.out.println("\nInorder Traversal is : ");
        theTree.inOrder(theTree.getRoot());
        System.out.println("\nPostOrder Traversal is : ");
        theTree.postOrder(theTree.getRoot());
        System.out.println("\npreOreder Traversal is : ");
        theTree.preOrder(theTree.getRoot());
         System.out.println("\nMaximum  : " + theTree.maximum().iData);
        System.out.println("Minimum : " + theTree.minimum().iData);
        System.out.println("Leafs: " + theTree.countleafs(theTree.getRoot()));
    }  // end main()

}
/*{25, 1.2} 
Inorder Traversal is : 
12 25 30 37 43 50 75 
PostOrder Traversal is : 
12 30 43 37 25 75 50 
preOreder Traversal is : 
50 25 12 37 30 43 75 
Maximum  : 75
Minimum : 12
Leafs: 4*/
