package p2.p2_2_4_use_generics;

public class Pocket<E> {
    private E data;

    public void put(E d) {
        this.data = d;
    }

    public E get() {
        return this.data;
    }
}
