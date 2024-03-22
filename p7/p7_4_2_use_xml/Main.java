package p7.p7_4_2_use_xml;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Main {
    public static void main(String[] args) throws Exception {
        try (
                InputStream is = new FileInputStream("p7/p7_4_2_use_xml/rpgsave.xml")) {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
            Element hero = doc.getDocumentElement();
            String name = hero.getElementsByTagName("name").item(0).getTextContent();
            String hp = hero.getElementsByTagName("hp").item(0).getTextContent();
            Element weapon = (Element) hero.getElementsByTagName("weapon").item(0);
            String nameW = weapon.getElementsByTagName("name").item(0).getTextContent();
            String power = weapon.getElementsByTagName("power").item(0).getTextContent();

            System.out.println("勇者の名前：" + name);
            System.out.println("勇者のHP：" + hp);
            System.out.println("武器の名前：" + nameW);
            System.out.println("武器の攻撃力：" + power);

        } catch (IOException e) {
            System.out.println("ファイル操作に失敗しました");
            e.printStackTrace();
        }
    }
}
