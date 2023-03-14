package basics;

public class Operators {

    public static void main(String[] args) {
        int i = 0;

        int one = ++i; // pre
        int two = i++; // post

        System.out.println(one + " " + two + " " + i);

        int i1 = 0;

        int one1 = --i1;
        int two1 = i1--;

        System.out.println(one1 + " " + two1 + " " + i1);

        // +, -, *, /, %

        String s1 = "xyz";
        String s2 = "abc";
        int a = 10, b = 20, c = 30;

        System.out.println(s1 + s2);
        System.out.println(a + b + c);

        // expression evaluate from left to right
        System.out.println(s1 + a + b);
        System.out.println(a + b + s1 + c);
        System.out.println(a + s1 + b + c);

        // <, <=, >, >= for primitive
        // ==, != primitives
        // == for objects

        // & true if both true
        // | true if one true
        // ^ if both are different
        // ~ complement
        // ! boolean complement

        // diff btw & and &&
        // in & both expressions are atleast evaluated
        // in && short circuits if first is false
        // same for | ||

        // test ? value1 : value2
        // value1 if true
        // value2 if false

        int x = 20;
        int y = 30;

        String res = (x > y) ? "x is greater" : "y is greater";
        System.out.println(res);
    }
}
