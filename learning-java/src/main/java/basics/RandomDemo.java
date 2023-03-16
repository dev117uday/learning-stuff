package basics;

import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {
        Random obj = new Random();

        System.out.println(obj.nextInt());
        System.out.println(obj.nextInt());
        System.out.println(obj.nextInt());
        System.out.println(obj.nextInt(100));
        System.out.println(obj.nextInt(100));
        System.out.println(obj.nextInt(100));
        System.out.println(obj.nextInt(100));
        System.out.println(obj.nextInt(100));
    }
}
