package newyork;

import java.util.Calendar;
import java.util.TimeZone;

public class Newyork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calNewYork= Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in New_York:"
                +calNewYork.getCalendarType()
                +calNewYork.getTime());
        System.out.println();
	}

}
