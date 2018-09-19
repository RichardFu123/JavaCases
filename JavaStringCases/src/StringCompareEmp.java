
public class StringCompareEmp {
// 01
	public static void main(String[] args) {
		String str = "Hello world";
		String anotherString = "hello world";
		Object obj = str;
		
		System.out.println( str.compareTo(anotherString));
		System.out.println( str.compareToIgnoreCase(anotherString));
		System.out.println( str.compareTo(obj.toString()));
	}

}
