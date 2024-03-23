package p8.p8_1_3_use_java_net_url;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        try {
            // URL(String)はJava20からDepricated
            URL url = URI.create("https://dokojava.jp").toURL();
            InputStream is = url.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            int i;
            while ((i = isr.read()) != -1) { // 代入式の返り値は代入された値になるのでこう書ける
                System.out.print((char) i);
            }
            System.out.println();
            isr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
