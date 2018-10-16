import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class NetGetPage {
//08
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.baidu.com");
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
			String line;
			while ((line = reader.readLine()) != null){
				System.out.println(line);
				writer.write(line);
				writer.newLine();
			}
			reader.close();
	        writer.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}