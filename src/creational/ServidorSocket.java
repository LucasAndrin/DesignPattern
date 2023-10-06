package creational;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocket {

    public static void main(String[] args) throws IOException {

        ServerSocket server = null;
        Socket connection = null;

        try {
            server = new ServerSocket(7000);
            connection = server.accept();
            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            do {
                String message = input.readLine();
                if (message != null) {
                    System.out.println(message);
                }
            } while (!"exit".equals(input.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert connection != null;
            connection.close();
            server.close();
        }

    }

}
