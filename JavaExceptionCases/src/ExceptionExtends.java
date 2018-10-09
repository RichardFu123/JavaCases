
public class ExceptionExtends {
//06
	public static void main(String[] args) {
		try
		{
			throw new MyException("My Exception");
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
	}

}

class MyException extends Exception{
	MyException(String s){
		super(s);
	}
}