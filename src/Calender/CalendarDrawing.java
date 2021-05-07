package Calender;

public class CalendarDrawing extends CalenderDayWeek {
//	years months days
	public void Drawing() {
		System.out.println(WEEK_NAMES[(MonthlyWeekDecision()+1)%7]);
	}
}
