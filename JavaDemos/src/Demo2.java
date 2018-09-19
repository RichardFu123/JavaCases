import java.util.Scanner;

public class Demo2 {
// input three numbers and return the maximum.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input three numbers: a,b and c splited by Space");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		a = (a>b)?a:b;
		a = (a>c)?a:c;
		System.out.println("The maximum of the three numbers is: "+a);
	}

}
