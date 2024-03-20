package p6.p6_9_challenge.c6_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("コピー元のファイル名とコピー先のファイルを指定してください");
            System.exit(1);
        }
        String from = args[0];
        String to = args[1];

        try (FileInputStream fis = new FileInputStream(from); FileOutputStream fos = new FileOutputStream(to)) {
            int i = fis.read();
            while (i != -1) {
                fos.write(i);
                i = fis.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
