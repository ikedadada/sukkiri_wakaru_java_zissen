package p3.p3_5_4_use_stream_for_internal_processing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<String> list = new ArrayList<String>(
            List.of("Java", "Java", "Ruby", "Python", "PHP", "Perl", "Scala", "Kotlin", "Go", "Swift", "Objective-C"));

    public static void main(String[] args) {
        System.out.println("stream().distinct()を使う");
        useDistinct();
        System.out.println();
        System.out.println("stream().filter()を使う");
        useFilter();
        System.out.println();
        System.out.println("stream().map()を使う");
        useMap();
        System.out.println();
        System.out.println("stream().sorted()を使う");
        useSorted();
        System.out.println();
        System.out.println("stream().limit()を使う");
        useLimit();
        System.out.println();
        System.out.println("stream().collect()を使う");
        useCollect();

    }

    public static void useDistinct() {
        list.stream().distinct().forEach(s -> System.out.println(s));
    }

    public static void useFilter() {
        list.stream().filter(s -> s.length() >= 4).forEach(s -> System.out.println(s));
    }

    public static void useMap() {
        list.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
    }

    public static void useSorted() {
        list.stream().sorted().forEach(s -> System.out.println(s));
    }

    public static void useLimit() {
        list.stream().limit(3).forEach(s -> System.out.println(s));
    }

    public static void useCollect() {
        List<String> result = list.stream().filter(s -> s.length() <= 4).collect(Collectors.toList());
        for (String s : result) {
            System.out.println(s);
        }
    }
}
