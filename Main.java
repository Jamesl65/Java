package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.*;

// import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        runnableRunning();

        // threadRunning();

        executorExample();
    }

    static void executorExample() throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new RunnableExample());
        executorService.submit(new ThreadExample());
        Future<Integer> future = executorService.submit(()-> {
            System.out.println("Hello from executorService");
            Thread.sleep(2000);
            return 42;
        });

        Integer result = future.get();  // Blocks until computation is complete
        System.out.println("Result: " + result);

        executorService.shutdown();
        // executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        System.out.println("Executor Complete");
    }

    static void runnableRunning() throws InterruptedException {
        Thread threadOne = new Thread(new RunnableExample());
        Thread threadTwo = new Thread(() -> System.out.println("Hello from a lambda style runnable"));

        threadOne.setName("RT1");
        threadTwo.setName("RT2");

        threadOne.run();
        // threadOne.start();
        threadTwo.start();

        threadOne.join(); // Waiting for thread to terminate
        System.out.println("Thread is terminated");
    }

    static void threadRunning() {
        Thread threadOne = new ThreadExample();
        Thread threadTwo = new ThreadExample();

        threadOne.setName("T1");
        threadTwo.setName("T2");

        threadOne.start();
        threadTwo.start();
    }
}
