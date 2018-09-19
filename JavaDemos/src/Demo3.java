import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input a number means the year to be judged");
		int year = scanner.nextInt();
		scanner.close();
		boolean isLeapYear = (year%4==0 && year%100!=0) || year%400==0;
		System.out.println("The year "+year+" is a leap year?: "+isLeapYear);
	}
}
