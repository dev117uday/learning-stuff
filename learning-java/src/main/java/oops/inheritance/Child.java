package oops.inheritance;

public class Child extends Parent {

    Child() {
        System.out.println("child " + this);
    }

    Child(int a) {
        super(a);
        System.out.println("child constructor");
    }

    void f2() {
        System.out.println("super keyword : ");
        super.f1();
        System.out.println("child");
    }
}
