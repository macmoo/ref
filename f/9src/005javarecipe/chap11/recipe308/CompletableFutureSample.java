package jp.co.shoeisha.javarecipe.chapter11.recipe308;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class CompletableFutureSample {

    public static void main(String[] args) {
        CompletableFuture<Integer> future =
            CompletableFuture.failedFuture(new Exception("エラー "));

        CompletionStage<Integer> stage2 =
            CompletableFuture.failedStage(new Exception("エラー "));

        CompletableFuture<Integer> future1 = CompletableFuture
            .supplyAsync(() -> compute())
            .orTimeout(3, TimeUnit.SECONDS)
            .whenComplete((result, ex) -> {
                // 成功時
                if (ex == null) {
                    String message = String.format("Result: %d", result);
                    System.out.println(message);

                // タイムアウト時
                } else {
                    String message = String.format("Error: %s", ex.getClass());
                    System.out.println(message);
                }
            });

        CompletableFuture<Integer> future2 = CompletableFuture
            .supplyAsync(() -> compute())
            .completeOnTimeout(-1, 3, TimeUnit.SECONDS);

        CompletableFuture
            .supplyAsync(() -> compute(),
                CompletableFuture.delayedExecutor(3, TimeUnit.SECONDS))
            .thenAccept(System.out::println);

        // Executorを指定することも可能
        Executor executor = Executors.newSingleThreadExecutor();
        CompletableFuture
            .supplyAsync(() -> compute(),
                CompletableFuture.delayedExecutor(3, TimeUnit.SECONDS, executor))
            .thenAccept(System.out::println);

        try {
            TimeUnit.SECONDS.sleep(10);
            System.out.println("future: " + future.isCompletedExceptionally());
            System.out.println("stage2: " + stage2.toCompletableFuture().isCompletedExceptionally());
            System.out.println("future1: " + future1.isDone());
            System.out.println("future2: " + future2.get());

        } catch(InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            if (ExecutorService.class.isInstance(executor)) {
                ((ExecutorService) executor).shutdown();
            }
        }

    }

    public static int compute() {
        Random r = new Random();
        int i = r.nextInt(5);
        System.out.println("sleep: " + i);
        try {
            TimeUnit.SECONDS.sleep(i);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        return i;
    }

}
