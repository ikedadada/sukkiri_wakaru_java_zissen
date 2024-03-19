package p2.p2_5_3_inner_class_local;

public class Outer {
    int outerMember = 2;

    void outerMethod() {
        int outerLocal = 3; // 実質final（再代入できない）
        class Inner {
            void innerMethod() {
                System.out.println("outerMember: " + outerMember);
                System.out.println("outerLocal: " + outerLocal);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }
}
