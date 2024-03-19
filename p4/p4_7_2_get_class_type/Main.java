package p4.p4_7_2_get_class_type;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Supplier<Class<?>>> list = new ArrayList<>();
        list.add(Main::getFromClassForName);
        list.add(Main::getFromClassMember);
        list.add(Main::getFromClassObject);
        for (Supplier<Class<?>> s : list) {
            Class<?> info1 = s.get();
            System.out.println(info1.getSimpleName());
            System.out.println(info1.getName());
            System.out.println(info1.getPackage().getName());

            System.out.println(info1.isArray());

            Class<?> info2 = info1.getSuperclass();
            System.out.println("superclass:" + info2.getName());

            Class<?>[] info3 = info1.getInterfaces();
            for (Class<?> c : info3) {
                System.out.println("intefaces:" + c.getName());
            }

        }

    }

    public static Class<?> getFromClassForName() {
        System.out.println("Class.forNameで取得します");
        try {
            return Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Class<?> getFromClassMember() {
        System.out.println("メンバー変数から取得します");
        return String.class;
    }

    public static Class<?> getFromClassObject() {
        System.out.println("オブジェクトから取得します");
        return new String().getClass();
    }
}
