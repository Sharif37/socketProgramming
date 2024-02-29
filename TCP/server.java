package reverseEcho ;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.* ;

public class server  extends Thread{

   Socket socket ;
   public server(Socket socket){
       this.socket=socket ;

   }

    @Override
    public void run() {
        super.run();
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream ps = new PrintStream(socket.getOutputStream());

            String message;
            StringBuilder reversedMessage;
            do {
                message = br.readLine();//request from client

                if (message == null) {
                    break;
                }

                reversedMessage = new StringBuilder(message);
                String reversedMsg =   reversedMessage.reverse().toString() ;

                ps.println(reversedMsg);//response from server
                System.out.println("Received: " + message);

            } while (!message.equals("dne"));

            System.out.println("Server has stopped.");
          socket.close();
        }catch (Exception ignored){

        }

    }

    public static void main(String[] args) throws Exception {

            ServerSocket ss = new ServerSocket(2000);
            int count=1 ;
            System.out.println("Server is running and waiting for connections...");
            Socket socket ;
            server server;
            do{
                socket = ss.accept();
                System.out.println("Client connected: "+count++);
                server=new server(socket);
                server.start();


            }while (true);




    }
}

