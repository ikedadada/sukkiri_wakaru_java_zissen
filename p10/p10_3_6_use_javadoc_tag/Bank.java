package p10.p10_3_6_use_javadoc_tag;

/**
 * 銀行クラス
 */
@SuppressWarnings("deprecation")
public class Bank {
    private double rate = 0.001;

    // メソッドでは/** を書いたときに、Enterキーを押すと、Javadocコメントが自動生成される
    /**
     * 預金する
     * 
     * @param dest
     * @param amount
     * @return
     */
    public int deposit(Account dest, int amount) {
        return (int) (amount * rate);
    }

}
