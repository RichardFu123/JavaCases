import java.io.File;
import java.util.Date;

public class DirLastModified {
//07
	public static void main(String[] args) {
		File dir = new File("./test");
		System.out.println("Last Modified: "+ new Date(dir.lastModified()));
	}

}
