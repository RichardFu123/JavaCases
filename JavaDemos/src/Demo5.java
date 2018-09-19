import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		try
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please select a function: 1.show all details. 2.query log-in logs. 0.quit");
			int command = scanner.nextInt();
			scanner.close();
			
			switch (command) {
			case 0:
				System.out.println("Welcome!");
				break;
			case 1:
				System.out.println("Showing all details...");
				break;
			case 2:
				System.out.println("showing log-in logs...");
				break;
			default:
				System.out.println("ERROR CODE!");
			}
		}
		catch (InputMismatchException E){
			System.out.println("That is not a number!");
		}
	}

}
