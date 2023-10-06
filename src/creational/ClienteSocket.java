package creational;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteSocket {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String text;
        Socket customer = new Socket("172.16.2.58", 7000);
//      customer = new Socket("127.0.0.1", 7000);
        PrintStream output;

        try {
            output = new PrintStream(customer.getOutputStream());
            do {
                text = input.nextLine();
                output.println(text);
            } while (!"sair".equals(text));
        } catch (IOException e) {
            System.out.println("Oops!");
        } finally {
            customer.close();
        }
    }

}
