
public class StringRemoveChar {
//03
	public static void main(String[] args) {
		String str = "this is not python";
		System.out.println(removeCharAt(str,0));
	}
	
	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos+1);
	}

}
