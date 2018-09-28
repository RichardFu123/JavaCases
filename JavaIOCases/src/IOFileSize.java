import java.io.File;

public class IOFileSize {
//08
	public static void main(String[] args) {
		File file = new File("test2.txt");
		long size = 0;
		try {
			if (!file.exists()||!file.isFile()) {
				size = -1;
				System.out.println("File do not exits");
			}
			else
			{
				size = file.length();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("The size of "+file.getName()+" is: "+size);
	}

}
