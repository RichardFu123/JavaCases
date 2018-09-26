
public class Overriding {
//06
	public static void main(String[] args) {
		Figure fig1 = new Figure(1.,3.);
		Figure fig2 = new Rectangle(5.,22.);
		Rectangle fig4 = new Rectangle(1.,1.);
		System.out.println("fig1: "+fig1.area());
		System.out.println("fig2: "+fig2.area());
		System.out.println("fig4: "+fig4.area());
	}

}

class Figure{
	double dim1;
	double dim2;
	Figure(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	Double area() {
		System.out.println("Inside area of figure.");
		return dim1*dim2;
	}
}

class Rectangle extends Figure{
	Rectangle(double a, double b){
		super(a,b);
	}
	Double area(){
		System.out.println("Inside area for rectangle");
		return dim1*dim2;
	}
}