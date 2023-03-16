package generics;

public class GenericDemo {

    public static void main(String[] args) {
        MyGenerics<String> myGenerics = new MyGenerics<>("uday yadav");
        myGenerics.displayObjDetails();
        System.out.println(myGenerics.getObj());
    }
}
