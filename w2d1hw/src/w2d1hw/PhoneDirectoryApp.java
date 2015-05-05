/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d1hw;

/**
 *
 * @author stella
 */
public class PhoneDirectoryApp {

    public static void main(String[] args) {
       direcoryopr dirr = new direcoryopr();
        dirr.insertFirst("a", 1111111);
        dirr.insertFirst("b", 72222);
        dirr.insertLast("c", 333332);
        dirr.insertLast("d", 44444442);
        dirr.displayList();
        System.out.println("Size: " + dirr.size());
        System.out.println(dirr.find("c"));
        System.out.println("Delete first: " + dirr.deleteFirst());

    }
}
/*Output:
 Name: a, Phone: 1111111
 Name: b, Phone: 722222
 Name: c, Phone: 333332
 Name: d, Phone: 44444442
 Size: 4
 Directory{name=c, pno=333332}
 Delete first: Directory{name=a, pno=111111}
 */
