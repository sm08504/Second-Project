import java.time.LocalDate;
import java.time.Period;

public class MyCalendarStuff {

	public static void main(String[] args) {
	LocalDate current = LocalDate.now();
	System.out.println("Today is " + current.getDayOfWeek() + " " + current.getDayOfMonth() + " " + current.getMonth());

	
	LocalDate startOfSemester = LocalDate.of(2017,  8, 14);
	System.out.println("Semester started " + startOfSemester.getDayOfWeek() + " " + startOfSemester.getDayOfMonth() + " " + startOfSemester.getMonth());
	
	Period p = Period.between(startOfSemester,  current);
	System.out.println("It is " + p.getMonths() + " months and" + p.getDays() + " days since semester started");
	}
}
