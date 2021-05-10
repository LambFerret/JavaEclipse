package Calender;

public class Main {
	public static void main(String[] args) {
//		final은 100% static final
		CalenderInput ci = new CalenderInput();
		CalenderDayWeek cd = new CalenderDayWeek();
		CalendarDrawing cdd = new CalendarDrawing();
		
		ci.inputDate();
		cd.WeekPrint();
		cdd.Drawing();
		
		
	}
}
