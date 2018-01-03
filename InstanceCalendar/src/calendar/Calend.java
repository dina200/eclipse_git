package calendar;

import java.util.Calendar;

public class Calend {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2017, 0, 1, 10, 25);
		long day1 = c.getTimeInMillis();
		day1 += 1000*60*60;
		c.setTimeInMillis(day1);
		System.out.println("New hour " + c.get(c.HOUR_OF_DAY));
		c.add(c.DATE, 35);
		System.out.println("Add 35 days " + c.getTime());
		c.roll(c.DATE, 35);
		System.out.println("Roll 35 days " + c.getTime());
		c.set(c.DATE, 1);
		System.out.println("Set the date for 1 " + c.getTime());

	}

}
