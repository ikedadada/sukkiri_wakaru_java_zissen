package p3.p3_5_3_use_stream_for_data_processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static List<String> list = new ArrayList<String>(
            List.of("Java", "Ruby", "Python", "PHP", "Perl", "Scala", "Kotlin", "Go", "Swift", "Objective-C"));

    public static void main(String[] args) {
        System.out.println("stream().allMatch()を使う");
        useAllMatch();
        System.out.println();
        System.out.println("stream().anyMatch()を使う");
        useAnyMatch();
        System.out.println();
        System.out.println("stream().noneMatch()を使う");
        useNoneMatch();
        System.out.println();
        System.out.println("stream().forEach()を使う");
        useForEach();
        System.out.println();
        System.out.println("stream().findFirst()を使う");
        useFindFirst();
        System.out.println();
        System.out.println("stream().findAny()を使う");
        useFindAny();
        System.out.println();
        System.out.println("stream().count()を使う");
        useCount();
        System.out.println();
        System.out.println("stream().max()を使う");
        useMax();

    }

    public static void useAllMatch() {
        boolean result = list.stream().allMatch(s -> s.length() >= 3);
        System.out.println("全ての要素が3文字以上か：" + result);
    }

    public static void useAnyMatch() {
        boolean result = list.stream().anyMatch(s -> s.length() >= 5);
        System.out.println("いずれかの要素が5文字以上か：" + result);
    }

    public static void useNoneMatch() {
        boolean result = list.stream().noneMatch(s -> s.length() >= 10);
        System.out.println("全ての要素が10文字未満か：" + result);
    }

    public static void useForEach() {
        list.stream().forEach(s -> System.out.println(s));
    }

    public static void useFindFirst() {
        Optional<String> result = list.stream().findFirst();
        System.out.println("最初の要素：" + result.get());
    }

    public static void useFindAny() {
        Optional<String> result = list.stream().findAny();
        System.out.println("どれかの要素：" + result.get());
    }

    public static void useCount() {
        long result = list.stream().count();
        System.out.println("要素数：" + result);
    }

    public static void useMax() {
        Optional<String> result = list.stream().max((s1, s2) -> s1.length() - s2.length());
        System.out.println("最大の要素：" + result.get());
    }

}
