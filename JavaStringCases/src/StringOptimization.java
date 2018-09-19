
public class StringOptimization {
//12
	public static void main(String[] args) {
		String[] variables = new String[50000];
		for (int i =0;i<50000;i++) {
			variables[i] = "s"+i;
		}
		long startTime = System.currentTimeMillis();
		for(int i = 0;i<50000;i++) {
			variables[i] = "hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("use string normally: "+(endTime-startTime)+" ms");
		startTime = System.currentTimeMillis();
		for(int i = 0;i<50000;i++) {
			variables[i] = new String("hello");
		}
		endTime = System.currentTimeMillis();
		System.out.println("new a String object: "+(endTime-startTime)+" ms");
		startTime = System.currentTimeMillis();
		for(int i = 0;i<50000;i++) {
			variables[i] = new String("hello");
			variables[i] = variables[i].intern();
		}
		endTime = System.currentTimeMillis();
		System.out.println("use the intern function of String: "+(endTime-startTime)+" ms");
	}

}
