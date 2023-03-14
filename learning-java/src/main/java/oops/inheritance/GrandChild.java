package oops.inheritance;

public class GrandChild extends Child {

    GrandChild() {
        System.out.println("grandchild : " + this);
    }

    @Override
    void f1() {
        System.out.println("parent is child class, cuz its grandchild");
    }
}
