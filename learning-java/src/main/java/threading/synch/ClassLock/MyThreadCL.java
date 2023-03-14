package threading.synch.ClassLock;

// when multiple threads are mutating same data, they might corrupt the state
// we use locks to obtain control so that no other thread interfere
// if they are synchronized and try to access it, they go to wait-state
// locks are on whole object


import threading.synch.DisplayMessage;

public class MyThreadCL extends Thread {

    String name;

    MyThreadCL( String name) {

        this.name = name;
    }

    public void run() {
        DisplayMessageCL.sayHello(name);
    }
}
