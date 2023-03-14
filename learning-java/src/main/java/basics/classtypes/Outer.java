package basics.classtypes;

public class Outer {

    static void f1() {
        System.out.println("inside inside-out f1");
    }

    static class Inner {
        static void f2() {
            System.out.println("inside Inner f2");
        }

        void f3() {
            System.out.println("non static method inner class");
        }

    }

    class InnerN {
        void f4() {
            System.out.println("InnerN f4 method");
        }
    }

    public static void main(String[] args) {
        Outer.f1();
        Inner.f2();

        Outer.Inner inner = new Outer.Inner();
        inner.f3();

        // this is illegal if we have static class present
        // solution : make another class
        // Outer.InnerN innerN = new InnerN();
        // innerN.f4();

        // refer non-static inner

    }

}
