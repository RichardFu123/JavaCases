import java.util.ArrayList;
import java.util.Vector;

public class Instanceof {
//07
	public static void main(String[] args) {
		   Object testObject = new ArrayList<>();
		      displayObjectClass(testObject);
		   }
		   public static void displayObjectClass(Object o) {
		      if (o instanceof Vector)
		      System.out.println("java.util.Vector");
		      else if (o instanceof ArrayList)
		      System.out.println("java.util.ArrayList");
		      else
		      System.out.println("" + o.getClass());
		   }

}
