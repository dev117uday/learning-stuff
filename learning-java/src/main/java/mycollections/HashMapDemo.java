package mycollections;

import java.util.HashMap;
import java.util.Map;

// weakhashmap : gc takes over key that are null quickly

public class HashMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<>();

        hmap.put(1, "uday yadav");
        hmap.putIfAbsent(2, "uday yadav");
        hmap.putIfAbsent(2, "another uday");
        hmap.putIfAbsent(3, "yadav uday");


        System.out.println(hmap.containsKey(2));
        hmap.getOrDefault(6, "");
        hmap.remove(3);
        System.out.println(hmap.toString());
        System.out.println(hmap.size());
        hmap.clear();
        System.out.println(hmap.toString());

        hmap.keySet();
        hmap.values();

    }
}
