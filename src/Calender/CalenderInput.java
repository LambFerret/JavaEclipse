package Calender;

public class CalenderInput extends GregorianCalender {

	public void inputDate() {
		int steps = 0;
		while (steps == 0) {
			System.out.println("년을 검색하세요");
			years = sc.nextInt();
			if (years < 0) {
				System.out.println("기원후 부터 기입해주세요");
			} else {
				steps++;
			}
		}
		while (steps == 1) {
			System.out.println("월을 검색하세요");
			monthSum();
			months = sc.nextInt();
			if (months < 0 || months > 12) {
				System.out.println("유효한 월을 적어주세요");
			} else {
				steps++;
			}
		}
		while (steps == 2) {
			System.out.println("일을 검색하세요");
			days = sc.nextInt();
			if (days < 0) {
				System.out.println("유효한 날짜를 기입해주세요");
			} else if (days > monthArray[months - 1]) {
				System.out.println("그 월을 초과하는 날짜입니다");
			} else {
				break;
			}
		}
	}
}
