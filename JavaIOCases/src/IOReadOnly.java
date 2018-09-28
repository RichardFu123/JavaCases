import java.io.File;

public class IOReadOnly {
//10
	public static void main(String[] args) {
		File f = new File("test4.txt");
		System.out.println(f.setReadOnly());
		System.out.println(f.canWrite());
		System.out.println(f.setWritable(true));
		System.out.println(f.canWrite());
	}

}
