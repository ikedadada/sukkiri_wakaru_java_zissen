# 結論

java.util.Collections.sort メソッドでインスタンスの配列をソートする際に、インスタンスが Comparable インターフェースを実装できない場合、
Comparator インターフェースを実装し、sort メソッドに渡すことでもソートを行うことができる。
