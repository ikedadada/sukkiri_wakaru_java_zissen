package p2.p2_4_3_use_sealed_class;

// Sealedクラスのpermitを使って許可するクラスはfinal宣言が必要
public final class Wizard extends Character {
    private int mp;

    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    public int getMp() {
        return mp;
    }

    public void heal(Character target) {
        switch (target) {
            case Hero h -> h.hp += 20;
            case Wizard w -> w.hp += 10;
            // デフォルトクラスを定義しなくてもよくなるとあるが、エラーになる。
            // 結局デフォルトクラスを定義する必要があるなら何の意味が、、、、？
            /**
             * An enhanced switch statement should be exhaustive; a default label
             * expectedJava(2099060)
             */
            default -> throw new IllegalArgumentException("対象が不正です");
        }
    }
}
