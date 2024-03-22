package p7.p7_3_4_use_resource_bundle_for_properties;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        searchFromClassPath();

        searchToLocaleFromClassPath("ja");
        searchToLocaleFromClassPath("en");
        searchToLocaleFromClassPath("fr");
    }

    public static void searchFromClassPath() {
        try {
            ResourceBundle rb = ResourceBundle.getBundle("p7.p7_3_4_use_resource_bundle_for_properties.rpg");
            String heroName = rb.getString("heroName");
            String heroHp = rb.getString("heroHp");
            System.out.println("勇者の名前：" + heroName);
            System.out.println("勇者のHP：" + heroHp);
        } catch (MissingResourceException e) { // 必須ではない
            System.out.println("リソースが見つかりませんでした");
        }

    }

    public static void searchToLocaleFromClassPath(String loc) {
        switch (loc) {
            case "ja":
                Locale.setDefault(Locale.JAPAN);
                break;
            case "en":
                Locale.setDefault(Locale.US);
                break;
            default:
                Locale.setDefault(Locale.FRANCE);
        }
        Locale local = Locale.getDefault();
        System.out.println(local.getCountry() + ":" + local.getLanguage());

        String now = (new SimpleDateFormat()).format(new Date());
        ResourceBundle rb = ResourceBundle.getBundle("p7.p7_3_4_use_resource_bundle_for_properties.messages");
        System.out.println(rb.getString("CURRENT_TIME_IS") + now);
    }
}
