
public class EnumAndSwitch {
//11
	public static void main(String[] args) {
		Car c;
		c = Car.tata;
		switch(c) {
		case lamborghini:
			System.out.println("Your choice is Lamborghini.");
			break;
		case tata:
			System.out.println("Your choice is tata.");
			break;
		case audi:
			System.out.println("Your choice is audi.");
			break;
		case fiat:
			System.out.println("Your choice is fiat.");
			break;
		case honda:
			System.out.println("Your choice is honda.");
			break;
		default:
			System.out.println("Do not find your car.");
			break;
		}
	}

}

enum Car{
	lamborghini,
	tata,
	audi,
	fiat,
	honda
}
