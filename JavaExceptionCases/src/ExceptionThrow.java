
public class ExceptionThrow {
//01
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.err.println("1 "+e.getMessage());
			System.err.println("2 "+e.getLocalizedMessage());
			System.err.println("3 "+e.toString());
		}
	}

}
