package jp.co.shoeisha.javarecipe.chapter11.recipe305;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalSample {

    public static void main(String[] args) {
        OptionalSample sample = new OptionalSample();
        sample.testOrElseThrow();
        sample.testIfPresentOrElse();
        sample.testStream();
        sample.testOr();
    }

    public void testOrElseThrow() {
        Optional<String> optional = Optional.empty();
        try {
            // 値が存在しない場合はNoSuchElementExceptionがスローされる
            String value = optional.orElseThrow();
        } catch(NoSuchElementException e) {
            System.out.println("no value is present");
        }
    }

    public void testIfPresentOrElse() {
        Optional<String> optional = Optional.empty();
        optional.ifPresentOrElse(this::someAction, this::emptyAction);
    }

    public void testStream() {
        List<Optional<String>> list = new ArrayList<>();
        list.add(Optional.empty());
        list.add(Optional.of("a"));
        Stream<String> stream = list.stream().flatMap(s -> s.stream());
        List<String> result = stream.collect(Collectors.toList());
        System.out.println(result);
    }

    public void testOr() {
        long userId = 1;
        Optional<User> user = find(userId).or(() -> findFromXXX(userId));
        System.out.println(user);
    }

    public Optional<User> find(long id) { return Optional.empty(); }
    public Optional<User> findFromXXX(long id) { return Optional.empty(); }

    private void someAction(String str) {
        System.out.println(str);
    }
    private void emptyAction() {
        System.out.println("no value is present");
    }

    private static class User {}

}
