import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the price($): ");
		double price = scanner.nextDouble();
		
		System.out.println("Please enter the amount:");
		int amount = scanner.nextInt();
		
		System.out.println("Please enter your money:");
		double count = scanner.nextDouble();
		
		scanner.close();
		
		double totalMoney = amount*price;
		
		totalMoney = (totalMoney>=500)?totalMoney*0.8:totalMoney;
		
		double balance = count - totalMoney;
		
		System.out.println("Total price: "+totalMoney);
		System.out.println("Balance: "+balance);
		if(balance<0) 
		{
		System.out.println("Please insert more money!");	
		}
	}

}
