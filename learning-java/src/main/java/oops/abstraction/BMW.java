package oops.abstraction;

// cannot be marked as final
public abstract class BMW {

    void commonfunc() {
        System.out.println("inside common function");
    }

    // this cannot be marked as static
    abstract void accelerate();

    // this will run fine
    public static void main(String[] args) {
        System.out.println("inside main method");
    }

}
