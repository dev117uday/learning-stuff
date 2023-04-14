public class Project {

    public static void main(String[] args) {
        System.out.println("hello world");
        for (String arg : args) {
            System.out.print(arg + " ");
        }

        int a1 = 3;
        int a2 = 2;
        int a3 = 5;

        // int a = 3+5*2-5;
        int a = a1 + a3 * a2 - a3;
        System.out.println(a);

    }
}
