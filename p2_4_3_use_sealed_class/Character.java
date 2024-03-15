package p2_4_3_use_sealed_class;

public sealed class Character permits Hero, Wizard {
    String name;
    int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

}
