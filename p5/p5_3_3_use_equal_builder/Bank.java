package p5.p5_3_3_use_equal_builder;

import org.apache.commons.lang3.builder.EqualsBuilder;

@SuppressWarnings("unused")
public class Bank {
    private String name;
    private String address;

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Deprecated
    public boolean old_equals(Object o) {
        if (o == this)
            return true;
        if (o == null)
            return false;
        if (!(o instanceof Bank))
            return false;

        Bank bank = (Bank) o;
        if (!bank.name.equals(name))
            return false;
        if (!bank.address.equals(address))
            return false;
        return true;
    }

    // 上記のコードと同様に動作する
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

}
