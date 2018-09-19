import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the year: ");
		int year = scanner.nextInt();
		System.out.println("Please enter the month: ");
		int month = scanner.nextInt();
		scanner.close();
		System.out.println("The year: "+year+" month: "+month+" has "+queryDays(year,month)+" days");
		
	}
	private static Boolean isLeapYear(int year) {
		return (year%4==0&&year%100==0)||year%400==0;
	}
	private static int queryDays(int year,int month) {
		switch(month) {
		case 1:
			return 31;
		case 2:  
			if(isLeapYear(year)) {
				return 29;
			}else {
				return 28;
			}
        case 3:  
            return 31;  
        case 4:  
            return 30;  
        case 5:  
            return 31;  
        case 6:  
            return 30;  
        case 7:  
            return 31;  
        case 8:  
            return 31;  
        case 9:  
            return 30;  
        case 10:  
            return 31;  
        case 11:  
            return 30;  
        case 12:  
            return 31;  
        default:  
        	System.out.println("Please enter a correct month.");  
        	return 0; 

		}
	}

}
