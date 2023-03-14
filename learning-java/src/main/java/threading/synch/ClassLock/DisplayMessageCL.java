package threading.synch.ClassLock;

public class DisplayMessageCL {

    // if sync is not present, msg will be displayed randomly
    public synchronized static void sayHello(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello : " + name);
        }
    }
}
