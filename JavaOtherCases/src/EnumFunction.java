
public class EnumFunction {
//12
	public static void main(String[] args) {
		System.out.println("Prices of Cars: ");
		for(Cars c: Cars.values()) {
			System.out.println(c+ " needs "+ c.getPrice()+ "K dollars");
		}
	}

}


enum Cars {
	lamborghini(900),
	tata(2),
	audi(50),
	fiat(15),
	honda(12);
	
	private int price;
	Cars(int p){
		price = p;
	}
	int getPrice() {
		return price;
	}
}