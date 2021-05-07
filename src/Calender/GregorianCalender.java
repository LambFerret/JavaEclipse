package Calender;

import java.util.Scanner;

public class GregorianCalender {
	Scanner sc = new Scanner(System.in);

	protected int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 월마다 날짜 갯수 계산
	final String[] WEEK_NAMES = { "일", "월", "화", "수", "목", "금", "토" }; // 요일
	protected static int years;
	protected static int months;
	protected static int days;

	public boolean isLeapDay() {
		return (years % 4 == 0 || (years % 100 != 0 && years % 400 == 0));
	}
	public int Fabruary() {
		if (isLeapDay() == true && months < 3) return -1; else return 0;
	}
	
	public void leapmonth() {
		if (isLeapDay() == true)
			monthArray[1] = 29;
	}

	public int monthSum() {
		int msum = 0;
		for (int i = 0; i < months - 1; i++) { // 몇월까지 날짜 갯수 계산
			msum += monthArray[i];
		}
		return msum;
	}

	public int leap() {
		return (years / 4) - (years / 100) + (years / 400);
	}
}
