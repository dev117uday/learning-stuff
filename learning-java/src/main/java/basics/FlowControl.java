package basics;

public class FlowControl {

    public static void main(String[] args) {
        if(true) {
            System.out.println("hello world");
        }

        int x = 1;

        switch (x) {
            case 3:
            case 1:
                System.out.println("printing 1");
                break;
            case 2:
                System.out.println("printing 2");
                break;
            default:
                System.out.println("nothing");
        }

        switch (x) {
            case 1 -> System.out.println("printing 1");
            case 2 -> {
                System.out.println("printing 2");
                System.out.println("enchanced switch");
            }
            default -> System.out.println("nothing");
        }
    }
}
