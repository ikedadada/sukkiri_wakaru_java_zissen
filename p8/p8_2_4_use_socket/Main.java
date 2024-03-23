package p8.p8_2_4_use_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class Main {
    public static void main(String[] args) {
        try {
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket sock = (SSLSocket) factory.createSocket("dokojava.jp", 443);

            InputStream is = sock.getInputStream();
            OutputStream os = sock.getOutputStream();

            os.write("GET /index.html HTTP/1.1\r\n".getBytes());
            os.write("Host: dokojava.jp\r\n".getBytes());
            os.write("\r\n".getBytes());
            os.flush();

            InputStreamReader isr = new InputStreamReader(is);
            int i;
            while ((i = isr.read()) != -1) {
                System.out.print((char) i);
            }

            sock.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
