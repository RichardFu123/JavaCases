import java.net.*;
import java.text.*;

public class NetLastModified {
//06
	public static void main(String[] args) {
		try
		{
			URL url = new URL("https://www.baidu.com/img/bd_logo1.png?where=super");
			URLConnection conn = url.openConnection();
			SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			conn.setUseCaches(false);
			long timeStamp = conn.getLastModified();
			System.out.println("Last Modified: "+ft.format(timeStamp));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
