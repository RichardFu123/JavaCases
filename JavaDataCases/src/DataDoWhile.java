
public class DataDoWhile {
//01
	public static void main(String[] args) {
		int limit = 100;
		int sum = 0;
		int i = 0;
		do
		{
			sum += i++;
		}
		while(i<=limit);
		System.out.println("Sum: "+sum);
	}

}
