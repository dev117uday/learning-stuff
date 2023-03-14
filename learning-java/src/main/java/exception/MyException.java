package exception;

// exception occurs cuz of runtime errors
// improper shutdown of resources
// pre defined and custom exceptions
// try catch throw finally throws
// You can handle exception using parent class of exception
// finally will run in all cases of try catch

public class MyException {

    public static void main(String[] args) {
        try {
            int a, b;
            a = 5;
            b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this will always execute");
        }

        try {
            var res = MyException.something(3,0);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("sorry");
        }

        int a = 1;
        int b = 0;

        if (b == 0) {
            throw new RuntimeException("sorry");
        }

        System.out.println("program can continue");
    }

    static int something(int a, int b) throws ArithmeticException {
        return a/b;
    }
}
