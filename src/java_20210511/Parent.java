package java_20210511;

public class Parent {

	String name;
	String address;
	int age;
// 디폴트 생성자
	public Parent() {
		super();
	}

//	생성자 생성방법 alt shift s -> O : 매개 변수 있는 생성자
	public Parent(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
}
