package jp.co.shoeisha.javarecipe.chapter11.recipe303;

public interface HelloWorld {
    default public String hello(String name) {
        return getMessage(name);
    }
    default public String helloPlus(String name) {
        return String.format("+++ %s +++", getMessage(name));
    }

    // インターフェース内でのみアクセスできる
    private String getMessage(String name) { return "Hello " + name; }
}
