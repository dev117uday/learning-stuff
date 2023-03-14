package basics.classtypes.nonstaticinner;

public class Outer {

    private static int x = 50;
    private int y = 10;

    Outer(int y) {
        this.y = y;
    }

    void f1() {
        System.out.println("outer classes non static method");
    }

    class Inner {

        private int y;

        Inner(int y) {
            this.y = y;
        }

        // static methods not allowed
        void f2() {
            System.out.println("inner classes non static method");
            System.out.println("outer class x " + Outer.x);
            System.out.println("outer class y " + Outer.this.y);
            System.out.println("inner classes y " + this.y);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer(30);
        outer.f1();

        Outer.Inner inner = outer.new Inner(20);
        inner.f2();

        System.out.println(inner.y);
    }
}
