package p1_5_2_sort_by_comparable_interface;

import java.lang.Comparable;

public class Account implements Comparable<Account> {
    int number;
    int zandaka;

    public Account(int number, int zandaka) {
        this.number = number;
        this.zandaka = zandaka;
    }

    public int compareTo(Account obj) {
        // 自身の方がobjよりも小さい場合は負の整数を返す
        if (this.number < obj.number) {
            return -1;
        }
        // 自身の方がobjよりも大きい場合は正の整数を返す
        if (this.number > obj.number) {
            return 1;
        }
        return 0;
    }

}
