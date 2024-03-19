package p1.p1_7_2_record;

public class Main {
    public static void main(String[] args) {
        History history = new LoginHistory("user1", 3, false);
        System.out.println(history.getHistory());
        History history2 = new LoginHistory("user1", 3, false);
        System.out.println("等値比較" + history.equals(history2));
        System.out.println("ハッシュコード(history):" + history.hashCode());
        System.out.println("ハッシュコード(history2):" + history2.hashCode());

    }
}
