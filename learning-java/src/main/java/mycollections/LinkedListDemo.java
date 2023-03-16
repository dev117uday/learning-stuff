package mycollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        Object objects[] = new Object[1000000];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Object();
        }
        long end = System.currentTimeMillis();
        System.out.println("time " + (float)(end - start) / 100);


        List<Object> arrlst = new ArrayList<>(1000000);
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrlst.add(new Object());
        }
        end = System.currentTimeMillis();
        System.out.println("time " + (float)(end - start) / 100);


        List<Object> lst = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            lst.add(new Object());
        }
        end = System.currentTimeMillis();
        System.out.println("time " + (float)(end - start) / 100);
    }
}
