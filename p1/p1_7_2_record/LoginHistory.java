package p1.p1_7_2_record;

public record LoginHistory(String user, int retry, boolean result) implements History {
    /**
     * 1. private修飾された各フィールドのようなもの（厳密にはフィールドとは異なり、thisをつけてもアクセスできない）
     * 2. 全フィールドを引数に持つコンストラクタ
     * 3. フィールドの値と同名のメソッド（getter）を自動生成
     * 4. 全フィールドの内容を用いたtoStringメソッドを自動生成
     * 5. 全フィールドの透過比較を用いたequalsメソッドを自動生成
     * 6. 全フィールドのハッシュ値を用いたhashCodeメソッドを自動生成
     */
    /**
     * 注意点1. レコードブロック内ではフィールドを宣言できない
     * 注意点2. レコードデータ取得メソッドにgetはつかない
     * 注意点3. setterは生成されない
     * 注意点4. 追加のコンストラクタ宣言はその先頭で他のコンストラクタを呼び出す必要がある
     * 注意点5. コンストラクタで入力値の検証ができる
     * ```
     * public record LoginHistory(String user, int retry, boolean result) {
     * public LoginHistory {
     * if (retry < 0 ) throw new IllegalArgumentException("retryは0以上である必要があります");
     * }
     * }
     * ```
     * 注意点6. 親インターフェースは持てるが、extendsによる親クラスは持てず、レコードクラスはfinalであるため、継承もできない
     */
    public String getHistory() {
        return String.format("User: %s, Retry: %d, Result: %b", user, retry, result);
    }
}