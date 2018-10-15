import java.net.*;

public class NetAddress {
//01
	public static void main(String[] args) {
		InetAddress address = null;
		try {
			address = InetAddress.getByName("www.baidu.com");
		}
		catch(UnknownHostException e)
		{
			e.printStackTrace();
			System.exit(2);
		}
		System.out.println(address.getHostName()+": "+address.getHostAddress());
		System.exit(0);
	}

}
