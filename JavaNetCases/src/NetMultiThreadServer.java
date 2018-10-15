import java.io.*;
import java.net.*;

public class NetMultiThreadServer implements Runnable {
//05
	Socket csocket;
	NetMultiThreadServer(Socket csocket){
		this.csocket = csocket;
	}
	public static void main(String[] args) {
		try {
			ServerSocket ssock = new ServerSocket(1234);
			System.out.println("Listening");
			while(true) {
				Socket sock = ssock.accept();
				System.out.println("Connected");
				new Thread(new NetMultiThreadServer(sock)).start();
				ssock.close();
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void run() {
		try {
			PrintStream pstream = new PrintStream(csocket.getOutputStream());
			for(int i = 100; i >= 0; i--) {
				pstream.println(i+" bottles of beer on the wall");
			}
			pstream.close();
			csocket.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
