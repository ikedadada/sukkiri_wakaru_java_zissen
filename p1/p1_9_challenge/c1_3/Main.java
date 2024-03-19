package p1_9_challenge.c1_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java入門", LocalDate.of(2011, 10, 7), "スッキリわかる");
        Book book2 = new Book("Python入門", LocalDate.of(2019, 06, 11), "カレーが食べたくなる");
        Book book3 = new Book("C言語入門", LocalDate.of(2018, 06, 21), "ポインタも自由自在");
        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);

        for (Book book : list) {
            System.out.println(book);
        }

        System.out.println("そのままソートする");
        Collections.sort(list);

        for (Book book : list) {
            System.out.println(book);
        }

        System.out.println("TitleComparatorでソートする");
        Collections.sort(list, new TitleComparator());

        for (Book book : list) {
            System.out.println(book);
        }

    }
}
