package p4.p4_5_2_get_local_timezone;

import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        TimeZone tz = TimeZone.getDefault();
        System.out.print("現在のタイムゾーン:");
        System.out.println(tz.getDisplayName());

        if (tz.useDaylightTime()) {
            System.out.println("夏時間を採用しています");
        } else {
            System.out.println("夏時間を最小していません");
        }

        System.out.print("世界表人事との時差は");
        System.out.println(tz.getRawOffset() / 3600000 + "時間");
    }

}
