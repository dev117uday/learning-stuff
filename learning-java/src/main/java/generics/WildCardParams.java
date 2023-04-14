package generics;

import java.util.ArrayList;

class A {

}

class B extends A {

}

public class WildCardParams {

    public static void main(String[] args) {
        WildCardParams wildCardParams = new WildCardParams();
        wildCardParams.myMethod(new ArrayList<Thread>());
    }

    public void myMethod(ArrayList<? extends Thread> l) {
        l.add(null);    // only this is allowed
        // l.add(" ");  // not allowed
    }

    public void myMethod2(ArrayList<? super B> l) {
        l.add(null);
        l.add(new B());
    }
}
