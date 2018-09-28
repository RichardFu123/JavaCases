import java.io.*;

public class IOReadAndWrite {
//04
	public static void main(String[] args) {
		try {
			BufferedWriter out1 = new BufferedWriter(new FileWriter("test.txt"));
			out1.write("string in test.txt\n");
			out1.close();
			InputStream in = new FileInputStream(new File("test.txt"));
			OutputStream out = new FileOutputStream(new File("test2.txt"));
			byte[] buf = new byte[1024];
			int len;
			while((len = in.read(buf))>0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
			BufferedReader in1 = new BufferedReader(new FileReader("test2.txt"));
			String str;
			while((str = in1.readLine())!=null) {
				System.out.println(str);
			}
			in1.close();
		}catch(Exception e) {}
	}

}
