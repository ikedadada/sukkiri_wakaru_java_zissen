package p2_6_1_what_is_optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // 1. newはできず、性的メソッドofNullableでOptionalを生成
        Optional<String> op1 = Optional.ofNullable("ミナト");
        Optional<String> op2 = Optional.ofNullable(null);

        // 2. isPresent()を用いて中身がnullかを検証できる
        System.out.println(op1.isPresent());
        System.out.println(op2.isPresent());

        // 3. get()で内容を取得できるが、nullなら例外が発生する
        System.out.println(op1.get());
        try {
            System.out.println(op2.get());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

        // 4. orElse()でnullを置換して内容を取得できる
        System.out.println(op1.orElse("名無し"));
        System.out.println(op2.orElse("名無し"));

    }
}
