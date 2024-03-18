package p3_3_1_use_lambda_function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> func = (String s) -> {
            return s.length();
        };

        int a = func.apply("Java");
        System.out.println("文字列「java」は" + a + "文字です。");
    }
}
