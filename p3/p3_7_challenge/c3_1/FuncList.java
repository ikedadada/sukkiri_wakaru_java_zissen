package p3.p3_7_challenge.c3_1;

public class FuncList {
    public static boolean isOdd(int x) {
        return x % 2 == 1;
    }

    public String passCheck(int point, String name) {
        return name + "さんは" + (point > 65 ? "合格" : "不合格");
    }
}