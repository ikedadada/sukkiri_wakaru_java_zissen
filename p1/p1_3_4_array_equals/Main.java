package p1.p1_3_4_array_equals;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3, 4, 5 };

        System.out.println("間違った判定：" + a.equals(b)); // false
        System.out.println("正しい判定：" + Arrays.equals(a, b)); // true
    }
}
