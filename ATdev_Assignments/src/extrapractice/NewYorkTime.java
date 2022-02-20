package extrapractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class NewYorkTime {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat smf = new SimpleDateFormat("HH:mm:ss");
		smf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println(smf.format(new Date()));		
	}
}
