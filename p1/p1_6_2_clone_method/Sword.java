package p1.p1_6_2_clone_method;

public class Sword implements Cloneable {
    String name;
    int damage;

    public Sword(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public Sword clone() {
        Sword result = new Sword(this.name, this.damage);
        return result;
    }
}
