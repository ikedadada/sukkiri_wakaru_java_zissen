package p7.p7_3_3_write_to_properties;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        try (Writer fw = new FileWriter("p7/p7_3_3_write_to_properties/rpgsave.properties")) {
            Properties p = new Properties();
            p.setProperty("heroName", "アサカ");
            p.setProperty("heroHp", "62");
            p.store(fw, "勇者の情報");
        } catch (IOException e) {
            System.out.println("ファイル操作に失敗しました");
        }
    }
}
