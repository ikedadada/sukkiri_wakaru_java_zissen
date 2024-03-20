package p6.p6_2_3_file_writer_bynary;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./p6/p6_2_3_file_writer_bynary/rpgsave.dat",
                    true);
            fileOutputStream.write(66);
            fileOutputStream.flush();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
