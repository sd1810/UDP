import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(4445);
        byte[] buffer = new byte[256];
        DatagramPacket packet = null;

        while(true)
        {
            packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            String msg = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Client data-" + msg);

            if(msg.equals("bye"))
            {
                System.out.println("Bye Client");
            }

        }
    }
}
