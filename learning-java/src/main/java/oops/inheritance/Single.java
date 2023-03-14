package oops.inheritance;

// every object inherits from  java.lang.Object implicitly

public class Single {
    
    void m1() {
        System.out.println("inside m1");
    }

    public static void main(String[] args) {
        var single = new Single();

        single.m1();

        // even though these methods arent defined, they are present in 
        // java.lang.Object
        single.hashCode();
        single.getClass();
    }

}
