package threading.deadlocks;

public class FirstResources {
    public synchronized void method1(SecondResources secondResources) {
        System.out.println("inside method1 for FR");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("invoking method 2 of SR");
        secondResources.method2();
    }

    public synchronized void method2() {
        System.out.println("inside method 2 of FR");
    }

}
