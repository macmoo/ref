package jp.co.shoeisha.javarecipe.chapter11.recipe304;

public class DeprecatedSample {
    public static void main(String[] args) {
        ObsoleteClass instance = new ObsoleteClass();
        instance.deprecation();
        instance.removal();

        Integer i = new Integer(1);
        System.out.println(i);
    }

    @SuppressWarnings({"deprecation", "removal"})
    public void method() {
        ObsoleteClass instance = new ObsoleteClass();
        instance.deprecation();
        instance.removal();
    }
}
