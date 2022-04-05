package jp.co.shoeisha.javarecipe.chapter11.recipe303;

import java.util.Arrays;
import java.util.List;

class MyStringBuilder implements SampleBuilder {
    private final List<String> list;

    MyStringBuilder(String... params) {
        list = List.of(params);
    }

    public String mkString() {
        return Arrays.toString(list.toArray());
    }

}
