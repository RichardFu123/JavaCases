import java.io.*;

public class IOReadLine {
//02
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("IOWrite.txt"));
			String str;
			while((str = in.readLine())!= null) {
				System.out.println(str);
			}
			System.out.println(str);
			in.close();
		} catch(IOException e) {}
	}

}
