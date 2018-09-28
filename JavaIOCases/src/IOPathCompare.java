import java.io.File;

public class IOPathCompare {
//14
	public static void main(String[] args) {
		File f1 = new File("test.txt");
		File f2 = new File("test4.txt");
		if(f1.compareTo(f2)==0) {
			System.out.println("Same path");
		}
		else
		{
			System.out.println("Different path");
		}
	}

}
