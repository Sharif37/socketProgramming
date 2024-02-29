package reverseEcho;


import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 2000);

            BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream ps = new PrintStream(socket.getOutputStream());

            String message;

            do {
                message = keyboardInput.readLine();
                ps.println(message);
                message = br.readLine();
                System.out.println("from server: " + message);
            } while (!message.equals("dne"));

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
