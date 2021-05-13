package java_20210513;

import java.text.SimpleDateFormat;

public class Calendar2 {
	public class Calendar {
		private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		public static final int MONDAY = 1;
		public static final int TUESDAY = 2;
		public static final int WEDNESDAY = 3;
		public static final int THURSDAY = 4;
		public static final int FRIDAY = 5;
		public static final int SATURDAY = 6;
		public static final int SUNDAY = 0;

		private boolean isLeafYear(int year) {
			return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		}

		private int getCount(int year, int month, int day) {
			int totalCount = 365 * (year - 1) + (year - 1) / 4 // 2020년까지 윤년
					- (year - 1) / 100 // 2020년까지 100의 배수는 제외
					+ (year - 1) / 400; // 2020년까지 400의 배수는 추가

			boolean isLeafYear = isLeafYear(year);
			if (isLeafYear) {
				monthArray[1] = 29;
			}

			for (int i = 0; i < month - 1; i++) {
				totalCount += monthArray[i];
			}
			totalCount += day;

			return totalCount;
		}

		public void print(int year, int month, int day) {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초 E요일");
			int totalCount = getCount(year, month, day);
			int dayOfWeek = totalCount % 7;
			String message = "";
			if (dayOfWeek == Calendar.MONDAY) {
				message = "월요일";
			} else if (dayOfWeek == Calendar.TUESDAY) {
				message = "화요일";
			} else if (dayOfWeek == Calendar.WEDNESDAY) {
				message = "수요일";
			} else if (dayOfWeek == Calendar.THURSDAY) {
				message = "목요일";
			} else if (dayOfWeek == Calendar.FRIDAY) {
				message = "금요일";
			} else if (dayOfWeek == Calendar.SATURDAY) {
				message = "토요일";
			} else if (dayOfWeek == Calendar.SUNDAY) {
				message = "일요일";
			}

			System.out.printf("%d년 %d월 %d일 %s 입니다.", year, month, day, message);

		}

		public void print(int year, int month) {
			System.out.println(year + "년 " + month + "월 달력입니다.");
			System.out.println("일\t월\t화\t수\t목\t금\t토");

			// 탭만큼 띄어쓰기 해야한다. 예)2021년 5월 달력을 출력하기 위해서는
			// 2021년 5월 1일까지 총 날짜를 구해서 7로 나눈 나머지 만큼 띄어쓰기
			// 하면 된다.

			int totalCount = getCount(year, month, 1);
			int rest = totalCount % 7;// 예)2021년 5월 1일은 토요일(6)
			int count = 0;
			for (int i = 0; i < rest; i++) {
				System.out.print("\t");
				count++;
			}

			for (int i = 1; i <= monthArray[month - 1]; i++) {
				System.out.print(i + "\t");
				count++;
				if (count % 7 == 0)
					System.out.println();
			}
			System.out.println();

		}

		public void print(int year) {
			for (int i = 1; i <= 12; i++) {
				print(year, i);
			}
		}
	}
}
