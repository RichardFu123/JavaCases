import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter three numbers, splited by Space: ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		scanner.close();
		System.out.println("Your numbers are a: "+a+", b: "+b+", c: "+c+".");
		int max,min,mid;
		max = (a>b&&a>c)?a:(b>c)?b:c;
		min = (a<b&&a<c)?a:(b<c)?b:c;
		mid = (a!=max&&a!=min)?a:(b!=max&&b!=min)?b:c;
		
		System.out.println("Three numbers sorted: "+min+" "+mid+" "+max+".");
	}

}
