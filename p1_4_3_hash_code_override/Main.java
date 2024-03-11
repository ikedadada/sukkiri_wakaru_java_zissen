package p1_4_3_hash_code_override;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Hero> list = new HashSet<>();
        list.add(new Hero("斎藤", 3));
        System.out.println("要素数：" + list.size());

        Hero deleteTargetHero = new Hero("斎藤", 3);
        list.remove(deleteTargetHero);

        System.out.println("要素数：" + list.size());

    }
}