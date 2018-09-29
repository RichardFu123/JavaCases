import java.io.File;

public class DirFiles {
//10
	public static void main(String[] args) {
		File dir = new File("..");
		String[] child = dir.list();
		if(child == null) {
			System.out.println("Not exists or not a dir");
		}
		else
		{
			for(String s : child) {
				System.out.println(s);
			}
		}
	}

}
