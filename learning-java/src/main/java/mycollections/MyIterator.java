package mycollections;

import java.util.ArrayList;
import java.util.ListIterator;

public class MyIterator {

    public static void main(String[] args) {
        ArrayList<Integer> arrlst = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrlst.add(i);
        }

        ListIterator<Integer> itr = arrlst.listIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }


    }
}
