package p10.p10_3_6_use_javadoc_tag;

/**
 * 口座クラス
 * 
 * @author minato
 * @deprecated 代わりにNewAccountを使用してください。
 * @see NewAccount
 */
@SuppressWarnings("unused")
public class Account implements java.io.Serializable {

    private static final long serialVersionUID = -8428727420373417318L;
    /** 残高 */
    private int zandaka;
    /** 口座名義人 */
    private String owner;

    /**
     * 他行への振り込みを行うメソッド
     * 
     * @param bank   送金先銀行
     * @param dest   送金先口座
     * @param amount 送金額
     * @return 送金手数料
     * @exception java.lang.IllegalArgumentException 残高不足の時
     */
    public int transfer(Bank bank, Account dest, int amount) {
        if (zandaka < amount) {
            throw new IllegalArgumentException("残高が足りません");
        }
        zandaka -= amount;
        return bank.deposit(dest, amount);
    }

}
