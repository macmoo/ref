package jp.co.shoeisha.javarecipe.chapter11.recipe301;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResourcesSample {
    public static void main(String[] args) throws IOException {
        new TryWithResourcesSample().read();
    }

    public void read() throws IOException {
        FileInputStream fileInputStream = doSomeMethod("src/jp/co/shoeisha/javarecipe/chapter11/recipe301/test.txt");
        try(fileInputStream) {
            Path path = Paths.get("fuga.txt");
            long size = Files.copy(fileInputStream, path);
            System.out.println(size + "バイトをコピーしました。");
        }
    }

    private FileInputStream doSomeMethod(String file) throws FileNotFoundException {
        return new FileInputStream(file);
    }
}
