package p4_5_1_get_local_locale;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale.getCountry() + "_" + locale.getLanguage());

        // SimpleDateFormatもロケールによって出力が変わる
        String now = (new SimpleDateFormat()).format(new Date());

        if (locale.getLanguage().equals("ja")) {
            System.out.println("現在時刻: " + now);
        } else {
            System.out.println("Current time: " + now);
        }
    }
}
