package p2_8_challenge.c2_1;

public class StrongBox<T> {
    private T item;

    public T get() {
        return item;
    }

    public void put(T i) {
        this.item = i;
    }
}
