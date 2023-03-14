package access;

// types of access modifers
// private
// public : class
// package : class : access within same package
// protected : those who inherit and same package

// in packages folder, only num4 is accessible

public class AccessModifiers {

    public static void main(String[] args) {
        System.out.println("hello world");
        var acm = new AnotherClass();
        System.out.println(acm.num3);
    }
}
