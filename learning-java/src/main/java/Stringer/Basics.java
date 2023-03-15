package Stringer;

public class Basics {

    public static void main(String[] args) {
        String s1 = "Uday Yadav"; // "" is a string literla

        String s2 = new String("Uday Yadav");

        char c[] = {'a', 'e', 'i', 'o', 'u'};

        String s3 = new String(c);

        byte b[] = {65, 66, 67};

        String s4 = new String(b);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        // String class is object, yet in system.out it prints the value
        // java, strings are immutable, they are re-created in String pool
        // why ? performance
        // its thread safe

        immutableDemo("Hello", "World");

        stringPoolDemo();

        stringEqualsDemo();

        stringMethods();
    }

    private static void stringMethods() {
        String s = "hello world";
        int len = s.length();
        int o = s.indexOf('o');
        int o1 = s.indexOf('z');
        System.out.println(o + " " + o1);
        System.out.println(s.charAt(2));

        String substring = s.substring(2);
        String substring1 = s.substring(1, 5);
        System.out.println(substring + " " + substring1);
        String s1[] = s.split(" ");
        System.out.println(s1[0] + "|" + s1[1]);
        System.out.println(s.replace('l','k'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }

    private static void stringEqualsDemo() {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1 == s2); // cuz of string-pool
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3); // false, cuz new memory location
        System.out.println(s1.equals(s3));
        // == will compare the memory location
        // for other objects, == and .equals are same, string class its diff where .equals compare content
    }

    private static void stringPoolDemo() {
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        // same memory location
    }

    private static void immutableDemo(String hello, String world) {
        // different hascodes
        System.out.println(hello + " " + world);
        System.out.println(hello.hashCode());
        hello = hello.concat(world);
        System.out.println(hello + " " + world);
        System.out.println(hello.hashCode());
    }
}
