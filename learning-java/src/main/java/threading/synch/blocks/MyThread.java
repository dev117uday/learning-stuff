package threading.synch.blocks;

// when multiple threads are mutating same data, they might corrupt the state
// we use locks to obtain control so that no other thread interfere
// if they are synchronized and try to access it, they go to wait-state
// locks are on whole object


public class MyThread extends Thread {

    DisplayMessage dm ;
    String name;

    MyThread(DisplayMessage dm, String name) {
        this.dm = dm;
        this.name = name;
    }

    public void run() {
        dm.sayHello(name);
    }
}
