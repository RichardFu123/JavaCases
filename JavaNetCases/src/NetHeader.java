import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NetHeader {
//10
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.baidu.com");
	        URLConnection conn = url.openConnection();
	        
	        Map<String,List<String>> headers = conn.getHeaderFields();
	        Set<String> keys = headers.keySet();
	        for( String key : keys ){
	            String val = conn.getHeaderField(key);
	            System.out.println(key+"    "+val);
	        }
	        System.out.println( conn.getLastModified() );
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
