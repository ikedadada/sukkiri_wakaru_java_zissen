package p1_9_challenge.c1_4;

public record Monster(String name, int hp, boolean isBoss) {
    public Monster {
        if (hp <= 0) {
            throw new IllegalArgumentException("HP must be greater than 0");
        }
    }
}
