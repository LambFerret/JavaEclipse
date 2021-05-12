package java_20210512;

public interface InterA extends InterB, InterC{
//	인터페이스의 변수는 public static final이 생략되어있다.
//	public static final double PI = 3.14; 랑 동일
	double PI = 3.14;
//	인터페이스의 접근 한정자를 붙이지 않으면 public생략되어 있음.
//	abstract 생략 가능 
//	public abstract void mA(); 랑 동일
	void mA();
	
}
