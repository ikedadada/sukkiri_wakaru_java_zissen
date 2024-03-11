package p1_9_challenge.c1_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Monster monster1 = new Monster("お化けキノコ", 10, false);
        Monster monster2 = new Monster("ゴブリン", 25, false);
        Monster monster3 = new Monster("ドラゴン", 120, true);

        List<Monster> list = new ArrayList<>();
        list.add(monster1);
        list.add(monster2);
        list.add(monster3);

        for (Monster monster : list) {
            System.out.println(monster);
        }
    }
}
