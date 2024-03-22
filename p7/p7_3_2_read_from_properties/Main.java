package p7.p7_3_2_read_from_properties;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        try (
                Reader fr = new FileReader("p7/p7_3_2_read_from_properties/rpg.properties");) {
            Properties p = new Properties();
            p.load(fr);
            String name = p.getProperty("heroName");
            String strHp = p.getProperty("heroHp");
            int hp = Integer.parseInt(strHp);

            System.out.println("勇者の名前：" + name);
            System.out.println("勇者のHP：" + hp);
        } catch (IOException e) {
            System.out.println("ファイル操作に失敗しました");
        }
    }
}
