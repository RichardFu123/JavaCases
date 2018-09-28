import java.io.File;
import java.util.Date;

public class IOLastModified {
//07
	public static void main(String[] args) {
		try {
			File f = new File("test2.txt");
			f.createNewFile();
			Date fileTime = new Date(f.lastModified());
			System.out.println(fileTime.toString());
			System.out.println(f.setLastModified(System.currentTimeMillis()));
			fileTime = new Date(f.lastModified());
			System.out.println(fileTime+"");
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
