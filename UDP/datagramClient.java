package reverseEcho.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class datagramClient {

    public static void main(String[] args) throws Exception{
        DatagramSocket ds=new DatagramSocket(2001);
        String message="hello,world";
        DatagramPacket dp=new DatagramPacket(message.getBytes(),message.length(), InetAddress.getByName("localhost"),2000);
        ds.send(dp);

        byte b[]=new byte[1024];
        dp=new DatagramPacket(b,1024);
        ds.receive(dp);
        message=new String(dp.getData()).trim();
        System.out.println("From server:" + message);
        ds.close();



    }
}


