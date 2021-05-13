package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min= cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.printf("%d.%d.%d %d:%d:%d%n%n", year,month+1,day,hour,min,sec);
		StringBuffer message = new StringBuffer();
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		if (dayOfWeek == Calendar.SUNDAY) {
			message.append("일요일");
		} else if (dayOfWeek == Calendar.MONDAY) {
			message.append("월요일");
		}else if (dayOfWeek == Calendar.TUESDAY) {
			message.append("화요일");
		}else if (dayOfWeek == Calendar.WEDNESDAY) {
			message.append("수요일");
		}else if (dayOfWeek == Calendar.THURSDAY) {
			message.append("목요일");
		}else if (dayOfWeek == Calendar.FRIDAY) {
			message.append("금요일");
		}else if (dayOfWeek == Calendar.SATURDAY) {
			message.append("토요일");
		}
		System.out.printf("%d년 %d월 %d일 %s 입니다.", year, month+1, day, message.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초 E요일");
		cal.set(2020, 4,13);
		Date d = cal.getTime();
		String display = sdf.format(d);
		System.out.println();
		System.out.println(display);
		
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
	}

}
