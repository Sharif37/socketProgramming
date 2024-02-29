package reverseEcho.UDP;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class datagramServer {

    public static void main(String[] args) throws Exception{
        DatagramSocket ds=new DatagramSocket(2000);

        byte b[]=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b,1024);
        ds.receive(dp);

        String message=new String(dp.getData()).trim();
        System.out.println("From client :" + message);
        StringBuilder sb=new StringBuilder(message);
        sb.reverse();
        message=sb.toString();


        dp=new DatagramPacket(message.getBytes(),message.length(), InetAddress.getByName("localhost"),2001);
        ds.send(dp);
        ds.close();



    }
}

