# 結論

ミュータブルなインスタンスのコピーを行う場合は Clonable インターフェースを実装し、clone メソッドを呼ぶ。
※Clonable インターフェースは内部に実装の指定はないが、clone メソッドを実装する。（実は Object クラスに実装されている）