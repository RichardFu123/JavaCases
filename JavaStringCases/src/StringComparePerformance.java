
public class StringComparePerformance {
//11
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "";
		System.out.print(s1+s2);
		long startTime = System.currentTimeMillis();
		for (int i=0;i<50000;i++) {
			s1 = "hello";
			s2 = "hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("creat string by keyword: "+(endTime-startTime)+" ms");
		startTime = System.currentTimeMillis();
		for(int i = 0;i<50000;i++) {
			s1 = new String("hello");
			s2 = new String("hello");
		}
		endTime = System.currentTimeMillis();
		System.out.println("creat string by new object: "+(endTime-startTime)+" ms");
	}

}
