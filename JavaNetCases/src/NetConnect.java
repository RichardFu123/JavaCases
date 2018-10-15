import java.io.IOException;
import java.net.*;

public class NetConnect {
//07
	public static void main(String[] args) {
		try {
			InetAddress address;
			Socket sock = new Socket("www.baidu.com",80);
			address = sock.getInetAddress();
			System.out.println("Connecting to: "+address);
			sock.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
