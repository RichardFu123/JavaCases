
public class Factorial {
//05
	public static void main(String[] args) {
		for(int i = 0;i<10;i++) {
			System.out.printf("factorial %d = %d\n", i,factorial(i));
		}
	}
	private static long factorial(long number) {
		return ((number<=1)? 1:number*factorial(number-1));
	}

}
