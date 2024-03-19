package p4.p4_7_3_use_reflection;

public class RefSample {
    public int times = 0;

    public RefSample(int t) {
        this.times = t;
    }

    public void hello(String msg) {
        this.hello(msg, this.times);
    }

    public void hello(String msg, int t) {
        this.times = t;
        for (int i = 0; i < this.times; i++) {
            System.out.println("Hello, " + msg + "!");
        }
    }
}
