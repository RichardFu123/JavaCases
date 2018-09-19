import java.util.StringTokenizer;

public class StringTokenizerEmp {
//08
	public static void main(String[] args) {
		String str = "This is a String , splited by StringTokenizer, created by Shawn";
		StringTokenizer st = new StringTokenizer(str);
		
		System.out.println("splited by Space");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		System.out.println("splited by comma");
		StringTokenizer st2 = new StringTokenizer(str,",");
		while(st2.hasMoreTokens())
		{
			System.out.println(st2.nextToken());
		}
	}

}
