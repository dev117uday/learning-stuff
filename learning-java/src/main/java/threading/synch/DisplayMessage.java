package threading.synch;

public class DisplayMessage {

    // if sync is not present, msg will be displayed randomly
    public synchronized void sayHello(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello : " + name);
        }
    }
}
