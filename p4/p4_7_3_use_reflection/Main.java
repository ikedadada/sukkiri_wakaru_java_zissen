package p4.p4_7_3_use_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> clazz = RefSample.class;

            // コンストラクタの取得
            Constructor<?> constructor = clazz.getConstructor(int.class);

            // インスタンスの生成
            RefSample rs = (RefSample) constructor.newInstance(3);

            // フィールドの取得
            Field f = clazz.getField("times");

            // フィールドの操作
            f.set(rs, 10);

            // フィールド値の取得
            System.out.println(f.get(rs));

            // メソッドの取得
            Method m = clazz.getMethod("hello", String.class, int.class);

            // メソッドの実行
            m.invoke(rs, "reflection!", 10);

            // クラスやメソッドへの修飾子を調べる
            System.out.println("クラスの修飾子がpublicであるか：" + Modifier.isPublic(clazz.getModifiers()));
            System.out.println("メソッドの修飾子がfinalであるか：" + Modifier.isFinal(m.getModifiers()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}