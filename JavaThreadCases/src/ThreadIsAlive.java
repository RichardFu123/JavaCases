
public class ThreadIsAlive extends Thread {
//01
	public static void main(String[] args) {
		ThreadIsAlive tt = new ThreadIsAlive();
		tt.setName("Thread");
		System.out.println(tt.isAlive());
		tt.start();
		System.out.println(tt.isAlive());
		for(int i = 0;i < 10; i++) {
			printMsg();
		}
		System.out.println(tt.isAlive());
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			printMsg();
		}
	}
	
	private static void printMsg() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("Thread name: "+name);
	}

}
