package jp.co.shoeisha.javarecipe.chapter11.recipe300;

public class SafeVarargsSample {

    public static void main(String[] args) {
        SafeVarargsSample sample = new SafeVarargsSample();
        String str = sample.head();
        System.out.println(str);
    }

    public String head() {
        return privateMethod("Java", "Scala", "C", "Ruby");
    }

    @SafeVarargs
    private <T> T privateMethod(T... a) {
        if(a.length == 0){
            return null;
        }
        return a[0];
    }

}
