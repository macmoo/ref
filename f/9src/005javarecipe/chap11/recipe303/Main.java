package jp.co.shoeisha.javarecipe.chapter11.recipe303;

public class Main implements HelloWorld {

    public static void main(String[] args) {
        Main instance = new Main();
        System.out.println(instance.hello("a"));
        System.out.println(instance.helloPlus("b"));

        SampleBuilder builder = SampleBuilder.builder();
        System.out.println(builder.mkString());
    }

}
