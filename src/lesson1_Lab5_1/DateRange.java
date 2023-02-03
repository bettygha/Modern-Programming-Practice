package lesson1_Lab5_1;

import java.time.LocalDate;

public class DateRange {

	LocalDate startDateCalendar;
	LocalDate endDateCalendar ;
	
	
	public DateRange(LocalDate startDateCalendar, LocalDate endDateCalendar) {
		super();
		this.startDateCalendar = startDateCalendar;
		this.endDateCalendar = endDateCalendar;
	}
	public boolean isInRange(LocalDate date) {
		if(date.compareTo(startDateCalendar) >= 0 && date.compareTo(endDateCalendar) <=0) {
			return true;
		}
		return false;
	}
	public String toString() {
		
		String resultString = startDateCalendar.toString() + " " + endDateCalendar.toString();
		return null;
	}
	public static DateRange getFirstDayOfMonth(LocalDate date) {
		return null;
	}
public static DateRange getLastDayOfMonth(LocalDate date) {
	return null;	
	}
	
}
