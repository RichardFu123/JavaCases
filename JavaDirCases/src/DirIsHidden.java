import java.io.File;

public class DirIsHidden {
//04
	public static void main(String[] args) {
		File f = new File("./test");
		System.out.println(f.isHidden());
	}

}
