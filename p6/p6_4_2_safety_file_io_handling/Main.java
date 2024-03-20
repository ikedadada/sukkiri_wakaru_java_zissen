package p6.p6_4_2_safety_file_io_handling;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("./p6/p6_4_2_safety_file_io_handling/output.txt");
            fileWriter.write("A");
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main2(String[] args) {
        try (FileWriter fileWriter = new FileWriter("./p6/p6_4_2_safety_file_io_handling/output.txt")) {
            fileWriter.write("A");
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
