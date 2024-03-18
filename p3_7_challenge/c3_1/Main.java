package p3_7_challenge.c3_1;

public class Main {
    public static void main(String[] args) {
        Func1 func = FuncList::isOdd;
        boolean a = func.call(15);
        System.out.println(a);

        Func2 func2 = new FuncList()::passCheck;
        String b = func2.call(66, "田中");
        System.out.println(b);
    }

}

@FunctionalInterface
interface Func1 {
    boolean call(int x);
}

@FunctionalInterface
interface Func2 {
    String call(int point, String name);
}