package basics;

public class Looping {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.print(i + " ");
            ++i;
        }
        System.out.println();

        do {
            System.out.print(i + " ");
        } while (i < 5);

        for (i = 0; i < 3; ++i) {
            System.out.print(i + " ");
        }

        System.out.println();

        int x = 20;

        label : {
            System.out.println("block begins");
            if(x == 20) {
                break label;
            }
            System.out.println("block ends");
        }

        System.out.println("end");

        for(i=0; i<10; ++i) {
            if(i%2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
