package threading.synch.blocks;

public class DisplayMessage {

    // if sync is not present, msg will be displayed randomly
    public void sayHello(String name) {
        synchronized (this) {
            // synchronized (DisplayMessageCL.class) // for class level lock
            for (int i = 0; i < 10; i++) {
                System.out.println("hello : " + name);
            }
        }
    }
}
