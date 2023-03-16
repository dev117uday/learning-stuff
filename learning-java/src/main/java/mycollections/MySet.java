package mycollections;

import basics.Stringer.SBComparator;

import java.util.*;

public class MySet {

    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 20; i++) {
            list.add(random.nextInt(10));
        }

        System.out.println(list);

        HashSet<Integer> sset = new HashSet<>(list);
        System.out.println(sset);

        Set<Integer> hset = new LinkedHashSet<>(list);
        System.out.println(hset);


        Set<Integer> treeSet = new TreeSet<>(list);
        System.out.println(treeSet);

        stringTreeSet();
        setDemo();

    }

    private static void setDemo() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set.contains(2));
        System.out.println(set.remove(3));
        System.out.println(set.isEmpty());
        System.out.println(set.isEmpty());
        System.out.println(set.toString());
    }

    private static void stringTreeSet() {
        Set<String> set = new TreeSet<>();
        set.add("abc");
        set.add("def");
        set.add("mno");
        set.add("xyz");

        for (String obj : set) {
            System.out.print(obj + " ");
        }
    }
}
