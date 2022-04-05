package jp.co.shoeisha.javarecipe.chapter11.recipe306;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsSample {

    public static void main(String[] args) {
    {
        List<String> list = Arrays.asList("a", "b", null, "c", null)
            .stream()
            .flatMap(s -> Stream.ofNullable(s))
            .collect(Collectors.toList()); // => List("a", "b", "c")
        System.out.println(list);
    }
    {
        List<Integer> list = List.of(20, 50, 90, 100, 110)
            .stream()
            .takeWhile(i -> i < 100)
            .collect(Collectors.toList()); // => List(20, 50, 90)
        System.out.println(list);
    }
    {
        List<Integer> list = List.of(20, 50, 90, 100, 110)
            .stream()
            .dropWhile(i -> i < 100)
            .collect(Collectors.toList()); // => List(100, 110)
        System.out.println(list);
    }
    {
        Stream<Integer> stream = Stream.iterate(10, i -> i < 50, i -> i * 2);
        stream.forEach(System.out::println);
    }
    {
        List<String> list = List.of("a", "b", "c");
        try {
            // UnsupportedOperationExceptionがスローされる
            list.add("d");
        } catch(UnsupportedOperationException e) {
            System.out.println("the add operation is not supported by this list");
        }
        try {
            // nullを渡すと例外がスローされる
            List<String> list2 = List.of("a", null);
        } catch(NullPointerException e) {
            System.out.println("an element is null");
        }
    }
    {
        Set<String> set = Set.of("a", "b", "c");
        try {
            // UnsupportedOperationExceptionがスローされる
            set.add("d");
        } catch(UnsupportedOperationException e) {
            System.out.println("the add operation is not supported by this set");
        }
        try {
            // nullを渡すと例外がスローされる
            Set<String> set2 = Set.of("a", null);
        } catch(NullPointerException e) {
            System.out.println("an element is null");
        }
        try {
            // 重複要素があると例外がスローされる
            Set<String> set3 = Set.of("a", "b", "a");
        } catch(IllegalArgumentException e) {
            System.out.println("there are any duplicate elements");
        }
    }
    {
        Map<String, Integer> map = Map.of("a", 10, "b", 20, "c", 30);
        try {
            // UnsupportedOperationExceptionがスローされる
            map.put("d", 40);
        } catch(UnsupportedOperationException e) {
            System.out.println("the put operation is not supported by this map");
        }
        try {
            // キーまたは値にnullを渡すと例外がスローされる
            Map<String, Integer> map2 = Map.of("a", 10, "b", null);
        } catch(NullPointerException e) {
            System.out.println("any key or value is null");
        }
        try {
            // 重複キーがあると例外がスローされる
            Map<String, Integer> map3 = Map.of("a", 10, "b", 20, "a", 30);
        } catch(IllegalArgumentException e) {
            System.out.println("the keys are duplicates");
        }
    }
    {
        Map<String, Integer> map = Map.ofEntries(
            Map.entry("a", 10), Map.entry("b", 20), Map.entry("c", 30));
        System.out.println(map);
    }
    {
        List<String> src = new ArrayList<>();
        src.add("a");
        src.add("b");
        src.add("c");
        List<String> list = List.copyOf(src);
        System.out.println(list);
    }
    {
        List<String> list = Arrays.asList("a", null);
        try {
            List.copyOf(list); // => NullPointerExceptionをスロー
        } catch(NullPointerException e) {
            System.out.println("it contains any nulls");
        }
    }
    {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        List<Integer> list = stream
            .filter(i -> i % 2 == 0)
            .collect(Collectors.toUnmodifiableList());
        System.out.println(list);
    }
    {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 4);
        Set<Integer> set = stream
            .filter(i -> i % 2 == 0)
            .collect(Collectors.toUnmodifiableSet()); // => [4, 2]
        System.out.println(set);
    }
    {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        Map<Integer, String> map = stream
            .collect(Collectors.toUnmodifiableMap(
                Function.identity(),
                i -> "value: " + i
            ));
        System.out.println(map);
    }
    {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        Map<Integer, String> map = stream
            .collect(Collectors.toUnmodifiableMap(
                i -> i % 2,
                i -> "value: " + i,
                (s1, s2) -> s1 + ", " + s2
            ));
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
    {
        Stream<Item> stream = Stream.of(
            new Item("Clothing", "Maxi Skirt", 3980),
            new Item("Accessories", "Piercing", 1980),
            new Item("Clothing", "Long coat", 7800)
        );

        Map<String, Long> map = stream
            .collect(Collectors.groupingBy(
                item -> item.getCategory(),
                Collectors.filtering(item -> item.getPrice() > 5000, Collectors.counting())
            ));
        System.out.println(map);
    }
    {
        Stream<Item2> stream = Stream.of(
          new Item2("Clothing", "Maxi Skirt", 3980, List.of("Bob")),
          new Item2("Accessories", "Piercing", 1980, List.of("Tom")),
          new Item2("Clothing", "Long coat", 7800, List.of("Mike"))
        );

        // グルーピングした生産者のListをListに配置
        Map<String, List<List<String>>> map1 = stream
            .collect(Collectors.groupingBy(
                item -> item.getCategory(),
                Collectors.mapping(item -> item.getProducers(), Collectors.toList())
            ));
        System.out.println(map1);
    }
    {
        Stream<Item2> stream = Stream.of(
            new Item2("Clothing", "Maxi Skirt", 3980, List.of("Bob")),
            new Item2("Accessories", "Piercing", 1980, List.of("Tom")),
            new Item2("Clothing", "Long coat", 7800, List.of("Mike"))
        );

        // グルーピングした生産者のListになる
        Map<String, List<String>> map2 = stream
            .collect(Collectors.groupingBy(
                item -> item.getCategory(),
                // flatMapping()メソッドはStreamを受け取る
                Collectors.flatMapping(item -> item.getProducers().stream(), Collectors.toList())
            ));
        System.out.println(map2);
    }

    }

}
