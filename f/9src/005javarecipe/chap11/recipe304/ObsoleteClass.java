package jp.co.shoeisha.javarecipe.chapter11.recipe304;

public class ObsoleteClass {
    @Deprecated
    public void deprecation() { System.out.println("a"); }

    @Deprecated(forRemoval=true)
    public void removal() { System.out.println("x"); }
}
