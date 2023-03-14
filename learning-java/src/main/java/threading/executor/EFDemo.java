package threading.executor;

// time consuming  : thread creation is expensive
// poor resource management with predefined thread
// not robust : cannot scale more than whats defined
// better approach  : thread-pool


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EFDemo {

    public static void main(String[] args) {

        Runner[] runners = { new Runner("ATM"), new Runner("BANK") , new Runner("Site"), new Runner("Mobile") };

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(Runner runner : runners) {
            executorService.submit(runner);
        }

        executorService.shutdown();

    }
}
