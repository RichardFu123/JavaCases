import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class NetGetDate {
//09
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.baidu.com");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			long date = conn.getDate();
			if(date == 0) {
				System.out.println("can not get date");
			}
			else
			{
				System.out.println("Date: "+ new Date(date));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
