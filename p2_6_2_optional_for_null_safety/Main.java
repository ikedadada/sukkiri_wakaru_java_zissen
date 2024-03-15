package p2_6_2_optional_for_null_safety;

import java.util.Optional;

public class Main {
    public static Optional<String> decorate(String s, char c) {
        String r;
        if (s == null | s.length() == 0) {
            r = null;
        } else {
            r = c + s + c;
        }
        return Optional.ofNullable(r);
    }

    public static void main(String[] args) {
        Optional<String> op1 = decorate("ミナト", '吉');
        // 必然的にnullを考慮した処理ができる
        System.out.println(op1.orElse("nullのために処理できません"));
    }
}
