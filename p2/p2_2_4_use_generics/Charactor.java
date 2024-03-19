package p2.p2_2_4_use_generics;

public class Charactor {
    String name;
    int hp;
    boolean isDead;

    public Charactor(String name, int hp, boolean isDead) {
        this.name = name;
        this.hp = hp;
        this.isDead = isDead;
    }

    public String toString() {
        return "名前：" + this.name + " / HP：" + this.hp + " / 死んでる？：" + this.isDead;
    }
}
