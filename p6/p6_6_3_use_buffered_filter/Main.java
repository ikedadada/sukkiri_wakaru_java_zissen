package p6.p6_6_3_use_buffered_filter;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("./p6/p6_6_3_use_buffered_filter/input.txt"))) {

            String data = bufferedReader.readLine();
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
