
public class SearchLastString {
//02
	public static void main(String[] args) {
		String str = "Hello world,hello Shawn";
		int lastIndex = str.lastIndexOf("Shawn");
		if (lastIndex == -1) 
		{
			System.out.println("do not find the string Shawn");
		}
		else {
			System.out.println("find the string in: "+lastIndex);
		}
	}

}
