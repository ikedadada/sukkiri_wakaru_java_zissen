package p10.p10_3_5_use_javadoc;

/**
 * 口座クラス
 * このクラスは1つの口座を表します。
 */
@SuppressWarnings("unused")
public class Account {
    /** 残高 */
    private int zandaka;
    /** 口座名義人 */
    private String owner;

    /**
     * 送金を行うメソッド
     * このメソッドを呼び出すと、<b>他の</b>口座に指定金額を送金します。
     */
    public void transfer(int amount, Account dest) {
        dest.zandaka += amount;
        this.zandaka -= amount;
    }
}
