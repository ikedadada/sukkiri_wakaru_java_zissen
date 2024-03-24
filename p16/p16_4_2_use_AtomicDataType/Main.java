package p16.p16_4_2_use_AtomicDataType;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
        System.out.println("止めるには「Stop」を入力してください");
        System.out.println("カウントダウンを開始します。");

        PrintingThread t = new PrintingThread();
        // t.setDaemon(true); // デーモンスレッドに設定すると、メインスレッドが終了すると、デーモンスレッドも終了する

        t.start(); // runだと、同じスレッド内で実行される

        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            String input = scanner.nextLine();
            if (input.equals("Stop")) {
                t.stopRequest();
            }
        }
        System.out.println("カウントダウンを止めます。");
    }
}

class PrintingThread extends Thread {
    private final AtomicBoolean stopRequested = new AtomicBoolean(false);

    public void run() {
        int i = 0;
        while (!stopRequested.get()) {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(i + "...");
                i++;
            } catch (InterruptedException e) {
                System.out.println("カウントダウンを終了します。");
                break;
            }

        }
        System.out.println("Stopping.");
    }

    public void stopRequest() {
        stopRequested.set(true);
    }
}