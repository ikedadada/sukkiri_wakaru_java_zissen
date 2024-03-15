package p2_5_2_inner_class_member.Field;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("Outer.outerStaticField: " + Outer.outerStaticField);
        System.out.println("Outer.outerFiled: " + outer.outerFiled);
        Outer.Inner si = outer.new Inner();
        si.innerMethod();
        System.out.println("Outer.outerStaticField: " + Outer.outerStaticField);
        System.out.println("Outer.outerFiled: " + outer.outerFiled);
    }
}