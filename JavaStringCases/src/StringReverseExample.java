
public class StringReverseExample {
//05
	public static void main(String[] args) {
		String str = "Shawn";
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println("Before reverse: "+str);
		System.out.println("After reverse: "+reverse);
	}

}
