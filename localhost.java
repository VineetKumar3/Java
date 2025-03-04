//program to know the local host ip address of the syatem
import java.net.InetAddress;
import java.net.UnknownHostException;

public class localhost {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Localhost IP Address: " + localhost.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unable to determine localhost IP address");
            e.printStackTrace();
        }
    }
}