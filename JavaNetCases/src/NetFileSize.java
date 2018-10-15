import java.net.*;

public class NetFileSize {
//04
	public static void main(String[] args) {
		try
		{
			int size;
			URL url = new URL("https://www.baidu.com/img/bd_logo1.png?where=super");
			URLConnection conn = url.openConnection();
			size = conn.getContentLength();
			if(size<0) {
				System.out.println("can not get the size.");
			}
			else
			{
				System.out.println("Size of the url is: "+size+" bytes");
			}
			conn.getInputStream().close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
