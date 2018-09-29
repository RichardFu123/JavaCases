import java.io.File;

public class DirDelete {
//02
	public static void main(String[] args) {
		deleteDir(new File("./test"));
	}
	
	private static boolean deleteDir(File dir) {
		if(dir.isDirectory()) {
			String[] child = dir.list();
			for(String s: child) {
				if(!deleteDir(new File(dir, s))) {
					return false;
				}
			}
		}
		if(dir.delete()) {
			System.out.println("Successful");
			return true;
		}
		else
		{
			System.out.println("Failed");
			return false;
		}
	}

}
