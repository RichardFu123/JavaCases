import java.io.*;

public class IOAppend {
//05
	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("test2.txt"));
			out.write("aString1\n");
			out.close();
			out = new BufferedWriter(new FileWriter("test2.txt",true));
			out.write("aString2");
			out.close();
			BufferedReader in = new BufferedReader(new FileReader("test2.txt"));
			String str;
			while((str = in.readLine())!=null) {
				System.out.println(str);
			}
			in.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
