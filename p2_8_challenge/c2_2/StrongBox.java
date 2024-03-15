package p2_8_challenge.c2_2;

public class StrongBox<T> {
    private T item;
    private KeyType keyType;
    private int count;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public T get() {
        count++;
        if (count < keyType.getRequiredTryCount())
            return null;
        return item;
    }

    public void put(T i) {
        this.item = i;
    }
}
