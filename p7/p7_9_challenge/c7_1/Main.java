package p7.p7_9_challenge.c7_1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("p7/p7_9_challenge/c7_1/pref.properties")) {
            Properties prof = new Properties();
            prof.load(fr);

            String capital = prof.getProperty("aichi.capital");
            String food = prof.getProperty("aichi.food");

            System.out.println(capital + ":" + food);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
