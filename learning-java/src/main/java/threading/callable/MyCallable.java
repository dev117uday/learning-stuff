package threading.callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    int num;

    public MyCallable(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " " + num);
        for (int i = 1; i <= num; i++) {
            num = num + i;
        }
        Thread.sleep(100);
        return num;
    }
}
