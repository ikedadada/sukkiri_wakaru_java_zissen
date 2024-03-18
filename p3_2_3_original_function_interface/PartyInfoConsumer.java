package p3_2_3_original_function_interface;

import java.util.Set;

@FunctionalInterface
public interface PartyInfoConsumer {
    public abstract void process(Set<Hero> party, Hero leader, String pName);
}
