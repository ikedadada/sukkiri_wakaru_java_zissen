package p16.p16_2_1_use_thread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("止めるには「Stop」を入力してください");
        System.out.println("カウントダウンを開始します。");

        Thread t = new Thread() {
            public void run() {
                try {
                    for (int i = 10; i >= 0; i--) {
                        System.out.println(i + "...");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("カウントダウンを終了します。");
                }
            }
        };

        t.start(); // runだと、同じスレッド内で実行される

        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            if (input.equals("Stop")) {
                t.interrupt();
            }
        }
        System.out.println("カウントダウンを止めます。");
    }
}
