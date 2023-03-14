package oops.abstraction.interfaces;

// interface will never have implementation, partial implementation should be abstract
// variables can be public static and final in interface, variables should be initialized in implementation
// cannot define blocks in interface, but possible in blocks
// cannot define constructor, but possible in abstract

// marker interface, provided by java : serializable, cloneable, random access
public class Runner {

    public static void main(String[] args) {
        Honda h = new Honda();

        h.go();
        h.stop();
    }
}
