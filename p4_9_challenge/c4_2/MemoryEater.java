package p4_9_challenge.c4_2;

import java.util.Locale;

public class MemoryEater {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        if (loc.equals(Locale.JAPAN)) {
            System.out.println("メモリを消費しています...");
        } else if (loc.equals(Locale.US)) {
            System.out.println("Eating memory...");
        }
        long[] larray = new long[1280000];
        for (int i = 0; i < larray.length; i++) {
            larray[i] = i;
        }
        System.out.println("配列を確保した");
    }
}
