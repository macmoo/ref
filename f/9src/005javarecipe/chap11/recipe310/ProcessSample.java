package jp.co.shoeisha.javarecipe.chapter11.recipe310;

import java.io.IOException;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

public class ProcessSample {

    public static void main(String[] args) throws IOException {
        {
            List<Process> result = ProcessBuilder.startPipeline(
                List.of(
                    new ProcessBuilder("ls"),
                    new ProcessBuilder("sort", "-r")
                )
            );

            // 最後のプロセスを取得
            Process process = result.get(result.size() - 1);

            // destroy()メソッドでプロセスを正常終了させることができる場合はtrueを返す
            boolean isNormalKill = process.supportsNormalTermination();

            // ProcessHandleを返す
            ProcessHandle handle = process.toHandle();

            // プロセスIDを取得
            long pid = process.pid();

            // プロセスの情報(スナップショット)を取得
            ProcessHandle.Info info = process.info();

            // 子プロセスの一覧を取得
            Stream<ProcessHandle> children = process.children();

            // 子孫プロセスの一覧を取得
            Stream<ProcessHandle> descendants = process.descendants();

            // 現在のプロセス
            ProcessHandle current = ProcessHandle.current();
            // プロセスの開始時間
            Optional<Instant> startTime = current.info().startInstant();
        }

        {
            Process process = new ProcessBuilder("java", "src/jp/co/shoeisha/javarecipe/chapter11/recipe310/ThreadSleep.java", "5000").start();
            long pid = process.pid();
            System.out.println("Starts a new process: " + pid);
            // プロセスIDを指定
            ProcessHandle handle = ProcessHandle.of(pid).orElseThrow();
            // プロセスの終了をトリガーにするCompletableFutureを取得
            CompletableFuture<ProcessHandle> future = handle.onExit();
            try {
                // get()メソッドでプロセスが終了するまで待機
                boolean isAlive = future.get().isAlive();
                System.out.println("isAlive: " + isAlive);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            System.out.println("The process " + pid + " has terminated");
        }

        {
            Process process = new ProcessBuilder("java", "src/jp/co/shoeisha/javarecipe/chapter11/recipe310/ThreadSleep.java", "5000").start();
            System.out.println("Starts a new process: " + process.pid());
            // Process#waitFor()の代替となるもので、ラムダ式でプロセス実行結果を評価可能
            CompletableFuture<Boolean> future = process.onExit()
                .thenApply(p -> p.exitValue() == 0);
            try {
                boolean exitValue = future.get();
                System.out.println("exitValue: " + exitValue);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            System.out.println("The process " + process.pid() + " has terminated");
        }

        // すべてのプロセス(スナップショット)
        Stream<ProcessHandle> all = ProcessHandle.allProcesses();

    }

}
