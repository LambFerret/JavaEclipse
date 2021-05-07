package java_20210430;

import java.util.Scanner;

/* 
날짜로 요일 맞추기 레시피.
1. 2001년 1월1일은 월요일, 1년은 365일
2. 4년마다 윤년계산 = 366일 ==> 2월29일
3. 100년마다 윤년 안계산 = 365일
4. 400년마다는 윤년 계산 = 366일 ==> 2월29일

Q: 그럼 2021년 4월 30일은 무슨요일일까요?
hint : 7로 나누세요
*/
public class CalenderDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		final int[] MONTH_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 월마다 날짜 갯수 계산 => 사실 12월은 숫자가 상관이없다
		final String[] WEEK_NAMES = { "토", "일", "월", "화", "수", "목", "금" }; // 요일
		int years = 0, months = 0, days = 0;
// 날짜 기입 장소
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
			} else if (days > MONTH_DAYS[months - 1]) {
				System.out.println("그 월을 초과하는 날짜입니다");
			} else {
				break;
			}
		}
		// 상수 초기화 및 설정
		final int leap = years / 4 - years / 100 + years / 400; // 윤년 갯수 계산
		int leapDay = 0;
		if (years % 4 == 0 || (years % 100 != 0 && years % 400 == 0)) { // 윤년일경우 2월이하일때 날짜조정
			if (months <= 2) {
				leapDay = -1;
			}
		}

		int msum = 0; // 월 날짜 갯수 변수 초기화
		int ytotal = years * 365; // 년 날짜 갯수
		for (int i = 0; i <= months - 2; i++) { // 몇월까지 날짜 갯수 계산
			msum += MONTH_DAYS[i];
		}
		int alldays = ytotal + leap + msum + days + leapDay; // 날짜 전부 계산
		int weekindex = alldays % 7; // 요일 인덱스 계산
		System.out.println(years + "년 " + months + "월 " + days + "일은 " + WEEK_NAMES[weekindex] + "요일 입니다!");

	}
}