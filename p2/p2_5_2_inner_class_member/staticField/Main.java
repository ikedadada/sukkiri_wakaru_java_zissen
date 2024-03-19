package p2.p2_5_2_inner_class_member.staticField;

public class Main {
    public static void main(String[] args) {
        System.out.println("Outer.outerStaticField: " + Outer.outerStaticField);
        Outer.Inner si = new Outer.Inner();
        si.innerMethod();
        System.out.println("Outer.outerStaticField: " + Outer.outerStaticField);
    }
}