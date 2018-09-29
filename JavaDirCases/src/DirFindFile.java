import java.io.*;

public class DirFindFile {
//11
	public static void main(String[] args) {
		File dir = new File("./");
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File dir,String name) {
				return name.startsWith("t");
			}
		};
		String[] child = dir.list(filter);
		if(child == null) {
			System.out.println("Not exists or not a dir");
		}
		else
		{
			for(String s: child) {
				System.out.println(s);
			}
		}
	}

}
