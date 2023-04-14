package exception;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// same goes for SET, HashMap and Queue

public class MyCopyOnWrite extends Thread {

    static CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
//        method1();
    }

    private static void method1() {
        CopyOnWriteArrayList<String> cwrl = new CopyOnWriteArrayList<String>();
        // List<String> cwrl = new ArrayList<>(); // this will give java.util.ConcurrentModificationException
        cwrl.add("Java");
        cwrl.add("Python");
        cwrl.add("AWS");
        cwrl.add("Docker");

        Iterator<String> iterator = cwrl.iterator();

        while (iterator.hasNext()) {
            String course = iterator.next();
            System.out.println(course);
            if (course.equals("Docker")) {
                cwrl.remove(course);
            }
        }
    }


}
