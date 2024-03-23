package p8.p8_6_challenge.c8_2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try {
            Socket sock = new Socket("smtp.example.com", 60025);
            OutputStream os = sock.getOutputStream();

            byte[] bytes = getBytes();
            os.write(bytes);
            os.flush();

            sock.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] getBytes() {
        String CRLF = "\r\n";
        String[] lines = {
                "HELO smtp.example.com",
                "MAIL FROM: asaka@example.com",
                "RCPT TO: minato@example.com",
                "DATA",
                "From: asaka@example.com",
                "Subject: Please send me your RPG",
                "Hello minato. I would like to play your RPG.",
                "Coud you please it to me ?",
                ".",
                "QUIT"
        };

        String requestString = String.join(CRLF, lines);
        return requestString.getBytes();
    }
}
