import java.util.Scanner;

public class Demo1 {
// compare two numbers and return the bigger one.
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("please input two numbers a and b, splited by Space");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		int max;
		if(a>=b) 
		{
			max = a;
		}
		else 
		{
			max = b;
		}
		System.out.println("The maximum is: "+max);
	}

}
