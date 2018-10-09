
public class ExceptionFinally {
//03
	public static void main(String[] args) {
		for(int i = 0; i < 11; i++) {
			try
			{
				System.out.println("  try: " + 1/(i%2));
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			finally
			{
				System.out.println("  Finally");
			}
			
		}
	}

}
