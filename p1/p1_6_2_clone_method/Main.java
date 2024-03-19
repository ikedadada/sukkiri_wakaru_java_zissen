package p1.p1_6_2_clone_method;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("ミナト");
        Sword s = new Sword("はがねの剣", 50);

        h1.setSword(s);
        System.out.println("装備:" + h1.sword.name);
        System.out.println("clone()で複製します");

        Hero h2 = h1.clone();

        System.out.println("コピー元の勇者の剣の名前を変えます");
        h1.sword.name = "ひのきの棒";
        System.out.println("コピー元の勇者の剣の名前を変えました");

        System.out.println("コピー元とコピー先の勇者の装備を表示します");
        System.out.println("コピー元の勇者の剣の名前:" + h1.sword.name);

        System.out.println("コピー先の勇者の剣の名前:" + h2.sword.name);

    }
}
