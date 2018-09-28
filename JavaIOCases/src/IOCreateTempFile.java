import java.io.*;

public class IOCreateTempFile {
//06
	public static void main(String[] args) {
		File f = null;
		try {
			f = File.createTempFile("tmp", ".txt");
			System.out.println("File path: "+f.getAbsolutePath());
			f.deleteOnExit();
			f = File.createTempFile("tmp", null, new File("D:\\"));
			System.out.println("File path: "+f.getAbsolutePath());
			f.deleteOnExit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
