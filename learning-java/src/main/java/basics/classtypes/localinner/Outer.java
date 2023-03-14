package basics.classtypes.localinner;

public class Outer {

    void f1() {
        System.out.println("inside outers f1");
        class LocalInner {
            void f2() {
                System.out.println("inside local inner f2");
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.f2();

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.f1();
    }
}
