package mycollections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        // throws exception when queue is empty
        System.out.println(queue.remove());
        // returns null when queue is empty
        System.out.println(queue.poll());

        System.out.println(queue.peek());

        // if queue under capacity then offer returns true else returns false
        System.out.println(queue.offer(6));
        System.out.println(queue.toString());

    }
}
