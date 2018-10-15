import java.net.URL;

public class NetResolveURL {
//11
	public static void main(String[] args) {
		try {
			URL url = new URL("https://tieba.baidu.com/index.html");
			System.out.println("URL: " + url.toString());
			System.out.println("Protocal: " + url.getProtocol());
			System.out.println("FileName: " + url.getFile());
			System.out.println("Host: " + url.getHost());
			System.out.println("Path: " + url.getPath());
			System.out.println("Port: " + url.getPort());
			System.out.println("DefaultPort: " + url.getDefaultPort());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
