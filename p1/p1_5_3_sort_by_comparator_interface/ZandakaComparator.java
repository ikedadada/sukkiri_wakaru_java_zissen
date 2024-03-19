package p1.p1_5_3_sort_by_comparator_interface;

import java.util.Comparator;

public class ZandakaComparator implements Comparator<Account> {
    public int compare(Account a1, Account a2) {
        if (a1.zandaka < a2.zandaka) {
            return -1;
        }
        if (a1.zandaka > a2.zandaka) {
            return 1;
        }
        return 0;
    }
}
