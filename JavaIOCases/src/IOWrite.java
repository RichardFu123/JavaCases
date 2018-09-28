import java.io.*;

public class IOWrite {
//01
	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("IOWrite.txt"));
			out.write("Hello world!");
			out.close();
			System.out.println("Successfull");
		}
		catch(IOException e){}
	}

}
