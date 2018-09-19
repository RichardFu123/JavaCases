
public class SearchStringEmp {
//06
	public static void main(String[] args) {
		String str = "Laji Baidu Gouri Tencent";
		int intIndex = str.indexOf("Tencent");
		
		if (intIndex == -1)
		{
			System.out.println("do not find that string");
		}
		else {
			System.out.println("find that string in: "+intIndex);
		}
	}

}
