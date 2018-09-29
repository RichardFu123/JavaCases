import java.io.File;

public class DirParentDir {
//06
	public static void main(String[] args) {
		File dir = new File("./test");
		System.out.println("The Parent Directory of "+dir.toString()+" is: "+dir.getParent());
	}

}
