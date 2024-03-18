package p3_4_2_example_lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<Account>();
        list.add(new Account(1000, 100));
        list.add(new Account(500, 200));
        list.add(new Account(200, 300));
        list.add(new Account(100, 400));

        // ラムダ式を使うと、Comparatorを実装したクラスを作らなくてもソートできる
        list.sort((a1, a2) -> a1.zandaka - a2.zandaka);

        for (Account a : list) {
            System.out.println(a.zandaka);
        }
    }
}
