import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your score: ");
		double score = scanner.nextDouble();
		scanner.close();
		if(score>100||score<0)
		{
			System.out.println("Wrong score!");
		}
		else if(score >= 90)
		{
			System.out.println("A");
		}
		else if(score >= 80)
		{
			System.out.println("B");
		}
		else if(score >= 60)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("D");
		}
	}

}
