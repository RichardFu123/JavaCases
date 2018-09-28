import java.io.File;

public class IOCreateFileInDir {
//13
	public static void main(String[] args) {
		try {
			File f = null;
			File dir = new File("c:\\");
			f.createTempFile("tmp", ".txt", dir);
			System.out.println(f.getAbsolutePath());
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
