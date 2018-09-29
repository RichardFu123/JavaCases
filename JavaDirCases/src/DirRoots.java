import java.io.File;

public class DirRoots {
//12
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		System.out.println("All the roots: ");
		for(File f: roots) {
			System.out.println(f.toString());
		}
	}

}
