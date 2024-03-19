package p4.p4_9_challenge.c4_1;

import java.lang.reflect.Method;

public class Launcher {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("クラス名と起動方法を指定してください");
            System.exit(1);
        }
        String fqcn = args[0];
        String runner = args[1];

        showMemoryUsage();

        try {
            Class<?> clazz = Class.forName(fqcn);
            Method[] methods = clazz.getMethods();
            for (Method m : methods) {
                System.out.println("メソッド：" + m.getName());
            }

            if (runner.equals("E")) {
                ProcessBuilder pb = new ProcessBuilder("java", fqcn);
                Process proc = pb.start();
                proc.waitFor();
            } else if (runner.equals("I")) {
                Method m = clazz.getMethod("main", String[].class);
                m.invoke(null, (Object) new String[] {});
            } else {
                System.out.println("起動方法の指定が不正です");
                System.exit(1);
            }

            showMemoryUsage();

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static void showMemoryUsage() {
        Runtime rt = Runtime.getRuntime();
        int useMemory = (int) (rt.totalMemory() - rt.freeMemory());
        System.out.println("メモリ使用量：" + useMemory / 1024 / 1024 + "MB");
    }
}
