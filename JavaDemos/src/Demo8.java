import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your salary: ");
		int salaryBeforeTax = scanner.nextInt();
		scanner.close();
		
		int taxSalary = salaryBeforeTax - 3500;
		double tax;
		
		tax = taxSalary<0?0.0:
			taxSalary<=1500?taxSalary*0.03:
				taxSalary<=4500?taxSalary*0.1-105:
					taxSalary<=9000?taxSalary*0.2-555:
                        taxSalary<=35000?taxSalary*0.25-1005:
                            taxSalary<=55000?taxSalary*0.3-2755:
                                taxSalary<=80000?taxSalary*0.35-5505:
                                    taxSalary*0.45-13505;
		System.out.println("Your tax for salary is: "+tax);

	}

}
