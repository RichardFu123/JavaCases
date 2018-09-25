import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeNow {
//02
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Time now: "+sdf.format(date));
	}

}
