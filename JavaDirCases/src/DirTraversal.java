import java.io.*;

public class DirTraversal {
//09
	public static void main(String[] args) {
		File dir = new File("D:\\");
		File[] files;
		FileFilter ff = new FileFilter() {
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};
		files = dir.listFiles(ff);
		System.out.println(files.length);
		if (files.length == 0) {
			System.out.println("Is not a dir or do not exists");
		}
		else
		{
			for(File f:files) {
				System.out.println(f.toString());
			}
		}
		
	}
}
