import java.util.Calendar;

public class TimeCalendar {
//03
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		int doy = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("Time now: "+ cal.getTime());
		System.out.println("Date: "+ day);
		System.out.println("Month: "+ month);
		System.out.println("Year: "+year);
		System.out.println("Day of week: "+dow);
		System.out.println("Day of month: "+ dom);
		System.out.println("Day of year: "+ doy);
	}

}
