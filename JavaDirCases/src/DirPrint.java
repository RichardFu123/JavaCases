import java.io.*;

public class DirPrint {
//08
	public static void main(String[] args) {
		try {
			showDir(1,new File("./test"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	private static void showDir(int indent, File f) throws IOException {
		for(int i = 0; i < indent; i++) {
			System.out.print('-');
		}
		System.out.println(f.getName());
		if(f.isDirectory()) {
			File[] fs = f.listFiles();
			for(File sf : fs) {
				showDir(indent+4,sf);
			}
		}
	}
}
