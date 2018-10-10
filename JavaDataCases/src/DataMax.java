import java.util.Collections;
import java.util.Vector;

public class DataMax {
//12
	public static void main(String[] args) {
		Vector<Double> v = new Vector<>();
		v.add(new Double("3.4324"));
		v.add(new Double("3.3532"));
		v.add(new Double("3.342"));
		v.add(new Double("3.349"));
		v.add(new Double("2.3"));
		Object obj = Collections.max(v);
		System.out.println("The maximum is: "+obj);
	}
}
