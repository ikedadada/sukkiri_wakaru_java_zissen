package p6.p6_2_2_file_reader;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("./p6/p6_2_2_file_reader/rpgsave.dat");
            System.out.println("すべてのデータを読んで表示します");
            int i = fileReader.read();
            while (i != -1) {
                char c = (char) i;
                System.out.println(c);
                i = fileReader.read();
            }
            System.out.println("ファイルの末尾に到達しました");
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
