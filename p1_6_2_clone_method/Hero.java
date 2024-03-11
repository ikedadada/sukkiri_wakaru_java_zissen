package p1_6_2_clone_method;

public class Hero implements Cloneable {
    String name;
    int hp;
    Sword sword;

    public Hero(String name) {
        this.name = name;
        this.hp = 100;

    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public Hero clone() {
        Hero result = new Hero(this.name);
        result.hp = this.hp;
        result.sword = this.sword.clone();
        return result;
    }
}
