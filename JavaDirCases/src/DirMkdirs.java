import java.io.File;

public class DirMkdirs {
//01
	public static void main(String[] args) {
		String dir = "D:\\a\\b\\c\\b\\c\\b\\c";
		File f = new File(dir);
		System.out.println("Status: "+ f.mkdirs());
	}

}
