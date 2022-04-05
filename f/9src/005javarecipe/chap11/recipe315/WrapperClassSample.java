package jp.co.shoeisha.javarecipe.chapter11.recipe315;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassSample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // オートボクシングで代替
        list.add(1);
        list.add(2);

        System.out.println(list);

        // 1番目の要素を削除
        list.remove(1);
        // 値が1の要素を削除
        list.remove(Integer.valueOf(1));

        System.out.println(list);
    }

}
