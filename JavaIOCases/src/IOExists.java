import java.io.File;

public class IOExists {
//11
	public static void main(String[] args) {
		File f = new File("test4.txt");
		System.out.println(f.exists());
	}

}
