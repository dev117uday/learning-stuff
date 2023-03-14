package threading.synch;

public class Runner {

    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();

        MyThread t1 = new MyThread(dm, "steve");
        MyThread t2 = new MyThread(dm, "uday");

        t1.start();
        t2.start();


    }
}
