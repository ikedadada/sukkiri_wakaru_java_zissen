package p3_7_challenge.c3_2;

public class Main {
    public static void main(String[] args) {
        Func1 func = (int x) -> x % 2 == 1;
        boolean a = func.call(15);
        System.out.println(a);

        Func2 func2 = (int point, String name) -> {
            return name + "さんは" + (point > 65 ? "合格" : "不合格");
        };
        String b = func2.call(66, "田中");
        System.out.println(b);
    }

}

@FunctionalInterface
interface Func1 {
    boolean call(int x);
}

@FunctionalInterface
interface Func2 {
    String call(int point, String name);
}