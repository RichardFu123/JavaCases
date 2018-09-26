
public class OverLoading {
//01
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test(19);
		test1.info();
		test1.info(2);
		test2.info();
		test2.info(4);
		
	}
	

}

class Test{
	int num;
	Test(){
		System.out.println("Constructor without args");
		num = 1;
	}
	Test(int arg){
		System.out.println("Constructor with one arg.");
		num = arg;
	}
	void info() {
		System.out.println("Function without args.");
	}
	void info(int arg) {
		System.out.println("Function with one arg.");
		System.out.println("num: "+num + ", arg: "+arg);
	}
}