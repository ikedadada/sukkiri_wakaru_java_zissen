package p1.p1_5_2_sort_by_comparable_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<Account>();
        list.add(new Account(1000, 100));
        list.add(new Account(500, 200));
        list.add(new Account(200, 300));
        list.add(new Account(100, 400));

        // AccountがComparableインターフェースを実装していない場合はエラーになる
        Collections.sort(list);

        for (Account a : list) {
            System.out.println(a.number);
        }
    }
}
