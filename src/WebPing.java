import javax.imageio.IIOException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

//Just shows how to connect to an exteranal address and collect information from it. makes sure the ping exists
public class WebPing {
    public static void main(String[] args) {
        try{
            InetAddress addr;
            Socket sock = new Socket("www.java2s.com", 80);
            addr = sock.getInetAddress(); //returns the IP address of the URL

            //if connected successfully it should state the address connected t o
            System.out.println("Connected to " + addr);
            sock.close();
        } catch (IOException e){
            System.out.println("Cannot connect to " + args[0]);
            System.out.println(e);
        }


    }
}