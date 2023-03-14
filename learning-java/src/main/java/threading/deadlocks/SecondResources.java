package threading.deadlocks;

public class SecondResources {
    public synchronized void method1(FirstResources firstResources) {
        System.out.println("inside method1 for SR");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("invoking method 2 of FR");
        firstResources.method2();
    }

    public synchronized void method2() {
        System.out.println("inside method 2 of SR");
    }

}
