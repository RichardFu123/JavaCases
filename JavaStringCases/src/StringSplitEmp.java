
public class StringSplitEmp {
//07
	public static void main(String[] args) {
		String str = "Shawn-handsome";
		String[] tmp;
		String delimater = "-";
		tmp = str.split(delimater);
		for(String s:tmp) {
			System.out.println(s);
		}
	}

}
