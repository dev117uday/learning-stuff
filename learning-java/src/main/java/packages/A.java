package packages;

import access.AnotherClass;
import static java.lang.System.out;

// java.lang is implicit imported
// you can provide full path of class explicitly
// cannot create same name class in same package
// you can creatae sub packages
// packages are named based on sub package names
// static imports like system.out or Integer.valueOf requires 
//      static keyword in import

public class A {
    public static void main(String[] args) {
        System.out.println("hello world from package A");
        var acm = new AnotherClass();
        System.out.println(acm.num4);
    }
}
