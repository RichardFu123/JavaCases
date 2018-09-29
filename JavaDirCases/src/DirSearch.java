import java.io.File;

public class DirSearch {
//05
	public static void main(String[] args) {
		File dir = new File("./test");
		String[] child = dir.list();
		if(child == null) {
			System.out.println("not exists.");
		}
		else
		{
			for(String s: child) {
				System.out.println(s);
			}
		}
	}
}
