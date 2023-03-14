package advance;

// primitive types are stored in stack space
// reference types (objects) are stored in heap
// GC collects (frees memory) when object is unreachable, doesn't run immediately
// it can be triggered manually using System.GC
// protected void finalize() runs when JVM is running out of memory

public class GarbageCollector {

    GarbageCollector() {
        System.out.println("CREATED " + this);
    }

    public static void main(String[] args) {
        System.out.println("hello");

//        for(int i=0;i<1000000; i++) {
//            new GarbageCollector();
//        }
        new GarbageCollector();
        new GarbageCollector();
        new GarbageCollector();
        new GarbageCollector();

        System.gc();

    }

    @Override
    protected void finalize() {
        System.out.println("destructor called " + this);
    }
}
