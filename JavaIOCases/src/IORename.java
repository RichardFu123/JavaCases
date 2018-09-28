import java.io.File;

public class IORename {
//09
	public static void main(String[] args) {
		File oldName = new File("test3.txt");
		File newName = new File("test4.txt");
		if(oldName.renameTo(newName)) {
			System.out.println("Rename successful");
		}else {
			System.out.println("error");
		}
	}
}
