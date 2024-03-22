package p7.p7_9_challenge.c7_2;

import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("p7.p7_9_challenge.c7_2.pref");
        String capital = rb.getString("aichi.capital");
        String food = rb.getString("aichi.food");

        System.out.println(capital + ":" + food);

    }

}
