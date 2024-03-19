package p3.p3_2_1_function_assignment_to_variable;

import java.util.function.Function;

public class Main {
    public static Integer len(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        // 変数名 = クラス名::メソッド名
        // 変数名 = インスタンス名::メソッド名

        Function<String, Integer> func = Main::len;

        int a = func.apply("Java");
        System.out.println("文字列「Java」は" + a + "文字です。");
    }
}
