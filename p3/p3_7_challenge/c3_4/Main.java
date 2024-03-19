package p3.p3_7_challenge.c3_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<String> memberList = new ArrayList<String>(
            Arrays.asList("菅原拓真", "湊雄輔", "朝香あゆみ", "大江岳人"));

    public static void main(String[] args) {
        memberList.stream()
                .filter(s -> s.length() <= 4)
                .forEach(s -> System.out.println(s + "さん"));
    }
}
