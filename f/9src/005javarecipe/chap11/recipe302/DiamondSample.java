package jp.co.shoeisha.javarecipe.chapter11.recipe302;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class DiamondSample {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("red");
        list.add("blue");
        list.add("white");
        list.add("black");

        Comparator<String> comparator = new Comparator<>() {
            @Override public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        Collections.sort(list, comparator);

        System.out.println(list);
    }

}
