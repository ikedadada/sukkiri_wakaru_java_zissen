package p2.p2_2_4_use_generics;

public class Main {
    public static void main(String[] args) {
        Pocket<Charactor> pocket = new Pocket<>();
        Charactor charactor1 = new Charactor("お化けキノコ", 10, false);
        pocket.put(charactor1);
        Monster monster1 = new Monster("ゴブリン", 25, false);
        pocket.put(monster1);

        Pocket<Healer> healerPocket = new Pocket<>();
        HealerCharactor healerCharactor1 = new HealerCharactor("スライム", 10, false);
        healerPocket.put(healerCharactor1);

    }
}
