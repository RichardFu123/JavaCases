
public class Varargs {
//14
	public static void main(String[] args) {
		int sum = 0;
		sum = sumVarargs(new int[] {22,33,233});
		System.out.println("the sum of numbers: "+sum);
	}
	
	static int sumVarargs(int...intArray) {
		int sum = 0;
		for(int i:intArray) {
			sum+=i;
		}
		return sum;
	}

}
