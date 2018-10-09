
public class ExceptionThread {
//04
	public static void main(String[] args) {
		MyThread t;
		for(int i = 0; i < 5; i++) {
			try
			{
				t = new MyThread();
				t.start();
			}
			catch(RuntimeException e)
			{
				e.printStackTrace();
			}
		}
	}

}

class MyThread extends Thread{
	public void run(){
		try 
		{
		Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println("mark");
			e.printStackTrace();
		}
		System.out.println("Throwing");
		throw new RuntimeException();
		
	}
}
