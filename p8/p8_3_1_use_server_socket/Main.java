package p8.p8_3_1_use_server_socket;

import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        ServerSocket svSock = new ServerSocket(39648);
        System.out.println("サーバー起動完了");
        Socket sock = svSock.accept();

        System.out.println(sock.getInetAddress() + "から接続");
        sock.getOutputStream().write("WELCOME".getBytes());
        sock.getOutputStream().flush();
        sock.close();
        svSock.close();

    }
}
