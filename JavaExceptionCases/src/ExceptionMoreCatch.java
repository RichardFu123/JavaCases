
public class ExceptionMoreCatch {
//02
	public static void main(String[] args) {

		int[] bugs = new int[2];
		for (int i = 0; i <=2; i++){
			try
			{
			bugs[i] = 1/i;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
			catch(ArithmeticException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
