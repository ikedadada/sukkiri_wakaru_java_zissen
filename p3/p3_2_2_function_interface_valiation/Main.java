package p3.p3_2_2_function_interface_valiation;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Consumer");
        useConsumer();
        System.out.println("Supplier");
        useSupplier();
        System.out.println("BiFunction");
        useBiFunction();

    }

    public static void useConsumer() {
        // 引数を受け取り、戻り値がない
        Consumer<String> func = System.out::println;
        func.accept("Hello");
    }

    public static void useSupplier() {
        // 引数をとらず、戻り値がある
        Supplier<String> func = System::lineSeparator;
        System.out.println("改行します" + func.get());
    }

    public static void useBiFunction() {
        // 引数を2つ受け取り、戻り値がある
        BiFunction<String, String, String> func = System::getProperty;
        String a = func.apply("java.version", "unknown");
        System.out.println(a);
    }
}
