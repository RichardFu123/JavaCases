import java.net.InetAddress;

public class NetHostName {
//03
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println("Local HostAddress: "+address.getHostAddress());
			System.out.println("Local HostName: "+address.getHostName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
