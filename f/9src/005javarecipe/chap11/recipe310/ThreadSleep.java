package jp.co.shoeisha.javarecipe.chapter11.recipe310;

public class ThreadSleep {

    public static void main(String[] args) throws InterruptedException {
        int millis = Integer.parseInt(args[0]);
        Thread.sleep(millis);
    }

}
