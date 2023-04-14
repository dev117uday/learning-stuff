package java8;

// called functional if and only if it has one method
// ex : runnable
// @FunctionalInterface, only 1 method allowed
// also cannot extends

@FunctionalInterface
interface A {
    void myMethod();
    // void something(); //illegal
}

@FunctionalInterface
interface B {
    int sum(int x, int y);
}

public class MyFunctionalInterface {

    public static void main(String[] args) {
        A a = () -> System.out.println("something like this");
        a.myMethod();

        B b = (x, y) -> x + y;
        System.out.println(b.sum(20, 30));
    }
}
