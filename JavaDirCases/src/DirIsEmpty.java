import java.io.File;

public class DirIsEmpty {
//03
	public static void main(String[] args) {
		File f = new File("./test");
		if(f.isDirectory()) {
			if(f.list().length>0) {
				System.out.println("Not Empty!");
			}
			else
			{
				System.out.println("Is Empty!");
			}
		}
		else
		{
			System.out.println("That is not a directory.");
		}
	}

}
