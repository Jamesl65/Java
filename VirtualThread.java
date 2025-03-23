package test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class VirtualThread {
    public static void main(String[] args) {
        int num = 100;
        runningThread(num, false);
        runningThread(num, true);
    }

    private static void running() {
        // System.out.println("Thread " + Thread.currentThread().getId() + " is sleeping");
        try {
            Thread.sleep(Duration.ofSeconds(10).toMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static Thread startThread() {
        Thread t = new Thread(() -> {
            running();
        });
        return t;
    }


    private static Thread startVirtualThread() {
        // Todo change to virtual thread
        Thread t = new Thread(() -> {
            running();
        });
        return t;
    }
    private static void runningThread(int num, boolean isVirtual) {
        long startTime = System.nanoTime();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Thread t = isVirtual ? startVirtualThread() : startThread();
            threads.add(t);
            t.start();
        }
        joiningThread(threads);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Time taken: " + isVirtual + ":" + duration + "ms");

    }

    private static void joiningThread(List<Thread> threads) {
        for (Thread t: threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }        
    }
}
