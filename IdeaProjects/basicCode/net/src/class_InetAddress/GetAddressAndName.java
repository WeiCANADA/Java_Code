package class_InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
* Class InetAddress
* public static InetAddress getByName​(String host);
* public static InetAddress getLocalHost()
* public String getHostAddress()

* */
public class GetAddressAndName {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();

        String hostAddress = localHost.getHostAddress();
        String hostName = localHost.getHostName();
        System.out.println("hostAddress :" + hostAddress +"/t" + "hostName :" + hostName);

        InetAddress address = InetAddress.getByName("LW-PC");
        String hostAddress1 = address.getHostAddress();
        String hostName1 = address.getHostName();
        System.out.println("MyAddress :" + hostAddress1 +"/t" + "hostName :" + hostName1);
        //byte[] address = iP.getAddress();
    }
}
