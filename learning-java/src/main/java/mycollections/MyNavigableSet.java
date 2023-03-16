package mycollections;

import java.util.TreeSet;

public class MyNavigableSet {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();

        tset.add(10);
        tset.add(20);
        tset.add(30);
        tset.add(40);
        tset.add(50);
        tset.add(60);
        tset.add(70);

        System.out.println(tset);

        System.out.println(tset.ceiling(20));
        System.out.println(tset.higher(30));
        System.out.println(tset.floor(10));
        System.out.println(tset.lower(30));
        System.out.println(tset.pollFirst());
        System.out.println(tset.pollLast());
    }
}
