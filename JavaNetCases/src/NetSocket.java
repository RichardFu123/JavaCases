import java.net.*;
import java.io.*;

public class NetSocket {
//02
	public static void main(String[] args) {
		Socket skt;
		String host = "localhost";
		if(args.length > 0) {
			host = args[0];
		}
		for (int i = 0; i < 1024; i++) {
			try
			{
				System.out.println("port: "+i);
				skt = new Socket(host,i);
				System.out.println("port "+i+" is being used");
				System.out.println(skt.getLocalAddress());
			}
			catch(UnknownHostException e)
			{
				
			}
			catch(IOException e) {
			}
			
			
		}
	}

}
