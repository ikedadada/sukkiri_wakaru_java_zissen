package p2_5_4_inner_class_anonymous;

// Suspress warnings

public class Main {
    public static void main(String[] args) {
        Pocket<Object> pocket = new Pocket<Object>();
        pocket.set(new Object() {
            String innerField = "anonymous inner class";

            @SuppressWarnings("unused")
            public String getInnerField() {
                return innerField;
            }
        });

        /**
         * new [匿名クラスの親クラス] {
         * [メンバ]匿名クラスの内容
         * }
         */

    }
}
