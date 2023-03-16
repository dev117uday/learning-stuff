package generics;

public class MyGenerics<T> {

    T obj;

    MyGenerics(T obj) {
        this.obj = obj;
    }

    public void displayObjDetails() {
        System.out.println(obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }
}
