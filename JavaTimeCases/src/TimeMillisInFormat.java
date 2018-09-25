import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeMillisInFormat {
//04
	public static void main(String[] args) {
	Long timeStamp = System.currentTimeMillis();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
	System.out.println("Formating result: "+sd);
	
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy!MM!dd~HH mm ss");
	String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
	System.out.println("Formating result: "+sd2);
	}

}
