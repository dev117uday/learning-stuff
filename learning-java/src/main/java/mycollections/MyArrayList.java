package mycollections;

import java.util.*;

public class MyArrayList {

    public static void main(String[] args) {

//        this works
//        ArrayList list = new ArrayList();
//        list.add(10);
//        list.add(new Integer(20));
//        list.add(30.34f);
//        list.add("hello");
//
//        System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(10);
        Collections.sort(list);
        System.out.println(list);

        demo();
    }

    private static void demo() {

        ArrayList<Integer> arrlst = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrlst.add(i);
        }

        int integer = arrlst.stream().max(Integer::compare).get();

        System.out.println(integer);

        arrlst.add(1,11);

        System.out.println(arrlst);

        // size to arrlst
        System.out.println("Size: " + arrlst.size());

        // get element from index arrlst
        System.out.println("index: " + arrlst.get(3));

        // arrlst isEmpty ?
        System.out.println("isEmpty : " + arrlst.isEmpty());

        // add one element
        arrlst.add(10);

        ArrayList<Integer> arrlst2 = new ArrayList<>();
        arrlst2.add(11);
        arrlst2.add(12);
        // addAll
        arrlst.addAll(arrlst2);

        System.out.println(arrlst);
        System.out.println(arrlst2);
        // clear
        arrlst2.clear();

        // contains
        System.out.println(arrlst.contains(13) + " " + arrlst.contains(1));

        // indexOf
        System.out.println("indexof: " + arrlst.indexOf(6));

        // remove
        System.out.println("element removed: " + arrlst.remove(6));
        System.out.println(arrlst);

        // set
        arrlst.set(2, 4);
        System.out.println(arrlst);

        // sort
        arrlst.sort(null);
        System.out.println(arrlst);

        // toArray
        var something = arrlst.toArray();
        System.out.println(Arrays.toString(something));

    }
}
