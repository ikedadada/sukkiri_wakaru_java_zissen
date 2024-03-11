package p1_4_3_hash_code_override;

import java.util.Objects;

public class Hero {
    String name;
    int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // HashSetやHashMapに格納する際に、同じ内容のインスタンスとして扱われるようにするために、hashCodeメソッドをオーバーライドする必要がある
    // Object.hashCode()はインスタンスのメモリアドレスをもとに計算される。（そのため異なるJVMにおいては同一オブジェクトでもハッシュ値が異なる）
    public int hashCode() {
        return Objects.hash(name, hp);
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null)
            return false;
        if (!(o instanceof Hero))
            return false;
        Hero r = (Hero) o;
        if (!this.name.trim().equals(r.name.trim())) {
            return false;
        }
        if (this.hp != r.hp) {
            return false;
        }
        return true;
    }
}
