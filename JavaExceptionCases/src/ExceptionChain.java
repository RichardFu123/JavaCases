
public class ExceptionChain {
//05
	public static void main(String[] args) {
		try
		{
			throw new Exception("Hello! ");
		}
		catch(Exception e)
		{
			System.err.print(e.getMessage());
			try
			{
				throw new Exception("Za Warudo!");
			}
			catch(Exception x)
			{
				System.err.println(x.getMessage());
				try
				{
					Thread.sleep(9000);
					System.err.println("!!!");
				}
				catch(Exception c) {}
			}
		}
	}

}
