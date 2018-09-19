
public class StringRegionMatch {
//10
	public static void main(String[] args) {
		String str1 = "Welcome to Microsoft";
		String str2 = "I work with microsoft";
		boolean match1 = str1.regionMatches(11, str2, 12, 9);
		boolean match2 = str1.regionMatches(true, 11, str2, 12, 9);
		System.out.println("no ignore case: "+ match1);
		System.out.println("ignore case: "+ match2);
	}

}
