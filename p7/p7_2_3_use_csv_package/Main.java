package p7.p7_2_3_use_csv_package;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Main {
    public static void main(String[] args) {
        try (CSVReader csvReader = new CSVReader(new FileReader("p7/p7_2_3_use_csv_package/rpgdata.csv"))) {

            for (String[] line : csvReader) {
                String name = line[0];
                String hp = line[1];
                String mp = line[2];
                System.out.println(name + "/" + hp + "/" + mp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
