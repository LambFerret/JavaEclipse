package Calender;

public class CalenderDayWeek extends GregorianCalender {

	public int MonthlyWeekDecision() {
		monthSum();
		int monthdays = ((years - 1) * 365 + leap() + monthSum() + Fabruary()) % 7;
		return monthdays;
	}

	public int WeekDecision() {
		int weekindex = (MonthlyWeekDecision() + days) % 7;
		return weekindex;
	}

	public void WeekPrint() {
		WeekDecision();
		System.out.println(years + "년 " + months + "월 " + days + "일은 " + WEEK_NAMES[WeekDecision()] + "요일 입니다!");
	}
}
