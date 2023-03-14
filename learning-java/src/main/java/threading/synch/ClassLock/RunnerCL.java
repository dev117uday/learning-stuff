package threading.synch.ClassLock;

import threading.synch.DisplayMessage;
import threading.synch.MyThread;

// static sync methods get the class level lock
// but still can access static, sync instance method, instance

public class RunnerCL {

    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();

        MyThreadCL t1 = new MyThreadCL("uday");
        MyThreadCL t2 = new MyThreadCL("steve");

        t1.start();
        t2.start();


    }
}
