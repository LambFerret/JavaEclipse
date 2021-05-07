package java_20210503;
//
//1 파운드 = 0.45359237 킬로그램
//1 인치 = 2.54 센티미터
//KILOGRAMS_PER_POUND, POUNDS_PER_KILOGRAM, CENTIMETERS_PER_INCH, INCHES_PER_CENTIMETER)

public class UnitConverter {
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double POUNDS_PER_KILOGRAM = 1/0.45359237;
	public static final double CENTIMETERS_PER_INCH = 2.54;
	public static final double INCHES_PER_CENTIMETER = 1/2.54;
    // 필요한 상수 정의

    public static double toPounds(double kilograms) {
    	return kilograms * POUNDS_PER_KILOGRAM;
        // 메소드 내부를 채워주세요
    }
    public static double toKilograms(double pounds) {
    	return pounds * KILOGRAMS_PER_POUND;
        // 메소드 내부를 채워주세요
    }
    public static double toCentimeters(double inches) {
    	return inches * CENTIMETERS_PER_INCH;
        // 메소드 내부를 채워주세요
    }
    public static double toInches(double centimeters) {
    	return centimeters * INCHES_PER_CENTIMETER;
        // 메소드 내부를 채워주세요
    }
    public static double toFahrenheit(double celsius) {
    	return celsius * 9 /5 + 32;
        // 메소드 내부를 채워주세요
    }
    public static double toCelsius(double fahrenheit) {
    	return (fahrenheit -32) * 5/9;
        // 메소드 내부를 채워주세요
    }
}