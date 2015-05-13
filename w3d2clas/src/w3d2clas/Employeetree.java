/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d2clas;

/**
 *
 * @author stella
 */
class Employee {

    public int id;
    public String name;
    public Employee lchild;
    public Employee rchild;

}

public class Employeetree {

    private Employee root;

    public void insert(int id, String name) {

        Employee newEmployee = new Employee();
        newEmployee.id = id;
        newEmployee.name = name;
        if (root == null) {
            root = newEmployee;

        } else {
            Employee current = root;
            Employee parent;
            while (true) {
                parent = current;
                if (id < current.id) {
                    current = current.lchild;
                }
                if (current == null) {
                    parent.lchild = newEmployee;
                    return;
                } else {
                    current = current.rchild;
                    if (current == null) {
                        parent.rchild = newEmployee;
                        return;
                    }
                }
            }

        }

    }

    public boolean find(int key) {
        Employee current = root;
        if (current.id == key) {
            return true;

        }
        while (current.id == key) {
            if (key < current.id) {
                current = current.lchild;
                if (current.id == key) {
                    return true;
                }
            } else {
                current = current.rchild;
                if (current.id == key) {
                    return true;
                }
                if (current == null) {
                    return false;
                }
            }

        }
        return false;

    }
    public void inOrder(Employee localroot){
        if(localroot!=null){
            inOrder(localroot.lchild);
            System.out.print(localroot.name+" ");
            inOrder(localroot.rchild);
        }
    }
}
