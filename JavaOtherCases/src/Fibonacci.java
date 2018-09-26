
public class Fibonacci {
//04
	public static void main(String[] args) {
		for (int i=0;i<=10;i++) {
			System.out.printf("fibonacci of %d if: %d", i,fibonacci(i));
			System.out.println();
		}
	}
	
	private static long fibonacci(long number) {
		if(number == 0||number == 1) {
			return 1;
		}
		else return fibonacci(number-1)+fibonacci(number-2);
	}

}
