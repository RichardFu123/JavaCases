import java.io.*;

public class IODelete {
//03
	public static void main(String[] args) {
		try {
			File file = new File("c:\\test.txt");
			if(file.delete()) {
				System.out.println("Delete file successful"+file.getName());
			}
			else
			{
				System.out.println("Delete file Failed");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
