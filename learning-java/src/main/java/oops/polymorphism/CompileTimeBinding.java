package oops.polymorphism;

public class CompileTimeBinding {

    void add(int a, int b) {
        System.out.println(a+b);
    }

    void add(float a, float b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        var inst = new CompileTimeBinding();

        inst.add(2,3);
        inst.add(2.43f,4.54f);

    }
}
