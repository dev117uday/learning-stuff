package oops.inheritance;

// as java doesn't support multiple inheritance, the parent class will implicitly inherits
// java.lang.Object and its methods will be available to children

// parent class is also called super class
// constructors are triggered from child to parent

public class Runner {

    public static void main(String[] args) {

//        System.out.println("\nparent printing");
//        var p = new Parent();
//        p.f1();

        System.out.println("\nchild printing");
        var c1 = new Child();
        // parent is initialized again, see constructor msg
        // but there memory location will be same
        // both f1 and f2 are present for child
        c1.f1();
        c1.f2();

        System.out.println();

        var gc = new GrandChild();
        gc.f1();
        gc.f2();

        System.out.println();
        var c2 = new Child(1);
    }
}
