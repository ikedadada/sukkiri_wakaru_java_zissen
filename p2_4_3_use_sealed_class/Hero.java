package p2_4_3_use_sealed_class;

public final class Hero extends Character {
    private boolean isFly;

    public Hero(String name, int hp, boolean isFly) {
        super(name, hp);
        this.isFly = isFly;
    }

    public boolean isFly() {
        return isFly;
    }
}
