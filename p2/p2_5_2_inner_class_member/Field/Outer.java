package p2.p2_5_2_inner_class_member.Field;

public class Outer {
    int outerFiled;
    static int outerStaticField;

    class Inner {
        void innerMethod() {
            // static以外のフィールドにもアクセスできる
            outerFiled = 10;
            outerStaticField = 20;
        }
    }

    void outerMethod() {
        Inner si = new Inner();
        si.innerMethod();
    }
}
