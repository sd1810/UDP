import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getLocalHost();
        byte[] buffer = null;

        while(true)
        {
            String data = scanner.nextLine();
            buffer = data.getBytes();

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 4445);
            socket.send(packet);

            if(data.equals("bye"))
            {
                break;
            }

        }
    }
}
