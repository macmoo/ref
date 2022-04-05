package jp.co.shoeisha.javarecipe.chapter11.recipe299;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class VarSample {
    public static void main(String[] args) throws IOException {
        var list = new ArrayList<String>();
        list.add("red");
        list.add("black");
        list.add("blue");

        // for文
        for (var i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        // 拡張for文
        for (var str : list) {
            System.out.print(str);
        }
        // try-with-resources文
        try(var in = new FileInputStream("src/jp/co/shoeisha/javarecipe/chapter11/recipe299/test.txt");
            var out = new FileOutputStream("src/jp/co/shoeisha/javarecipe/chapter11/recipe299/test2.txt")){
            byte[] bytes = new byte[1024];
            int len;
            while ((len = in.read(bytes)) > 0) {
                out.write(bytes, 0, len);
            }
        }
        // ラムダ式の引数
        list.sort((var s1, var s2) -> s1.length() - s2.length());
        System.out.print(list);
    }
}
