package p2_2_4_use_generics;

public class HealerCharactor extends Charactor implements Healer {
    public HealerCharactor(String name, int hp, boolean isDead) {
        super(name, hp, isDead);
    }

    public void heal() {
        System.out.println(super.name + "は回復魔法を唱えた！");
        super.hp += 10;
        System.out.println("HPが10回復した！");
    }
}
