package oops.inheritance;

public class Parent {

    int a;

    Parent() {
        System.out.println("parent object " + this);
    }

    Parent(int a) {
        this.a = a;
        System.out.println("parent constructor");
    }

    void f1() {
        System.out.println("parent");
    }
}
