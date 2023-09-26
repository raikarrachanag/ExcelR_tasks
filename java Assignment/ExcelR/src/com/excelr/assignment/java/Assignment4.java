package com.excelr.assignment.java;


import java.util.concurrent.*;

public class Assignment4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

        // Producer thread
        Runnable producer = () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Producing: " + i);
                    queue.put(i);
                    Thread.sleep(100); // Simulate some work
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Consumer thread
        Runnable consumer = () -> {
            try {
                while (true) {
                    Integer item = queue.take();
                    System.out.println("Consuming: " + item);
                    Thread.sleep(200); // Simulate some work
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Start producer and consumer threads
        executorService.execute(producer);
        executorService.execute(consumer);

        // Shutdown the thread pool after some time
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.schedule(() -> {
            executorService.shutdownNow();
            scheduler.shutdown();
        }, 5, TimeUnit.SECONDS);
    }
}
