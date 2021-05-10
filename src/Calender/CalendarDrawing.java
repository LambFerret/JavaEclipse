package Calender;

public class CalendarDrawing extends CalenderDayWeek {
//	years months days
	public void Drawing() {
		for (String i: WEEK_NAMES) {
			System.out.print(i +"\t");
		}
		System.out.println();
		int rest = MonthlyWeekDecision()/7 + 1;
		int count = 0;
		for(int i=0;i<rest;i++) {
			System.out.print("\t");
			count++;
		}
		
		for(int i=1;i<=monthArray[months-1];i++) {
			System.out.print(i+"\t");
			count++;
			if(count%7 ==0) System.out.println();
		}
		System.out.println();
		
	}
}
