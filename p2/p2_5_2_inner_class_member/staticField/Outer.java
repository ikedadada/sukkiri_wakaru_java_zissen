package p2.p2_5_2_inner_class_member.staticField;

public class Outer {
    int outerFiled;
    static int outerStaticField;

    static class Inner {
        void innerMethod() {
            // outerFiled = 10; // Error
            outerStaticField = 20;
        }
    }

    void outerMethod() {
        Inner si = new Inner();
        si.innerMethod();
    }
}
