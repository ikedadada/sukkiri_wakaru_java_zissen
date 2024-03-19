package p5.p5_3_4_use_hash_equal_builder;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Bank {
    String name;
    String address;

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
