package p1_5_3_sort_by_comparator_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<Account>();
        list.add(new Account(1000, 100));
        list.add(new Account(500, 200));
        list.add(new Account(200, 300));
        list.add(new Account(100, 400));

        // Comparatorを使うと、AccountがComparableインターフェースを実装していなくてもソートできる
        Comparator<Account> comp = new ZandakaComparator();
        Collections.sort(list, comp);

        for (Account a : list) {
            System.out.println(a.zandaka);
        }
    }
}
