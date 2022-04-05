package jp.co.shoeisha.javarecipe.chapter11.recipe303;

public interface SampleBuilder {
    public static SampleBuilder builder() {
        return builder("foo", "bar");
    }

    // インターフェース内でのみアクセスできる
    private static SampleBuilder builder(String... params) {
        return new MyStringBuilder(params);
    }

    public String mkString();
}
