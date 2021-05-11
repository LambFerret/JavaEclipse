package java_20210511;

public class Child extends Parent {
	String phone;
	double weight;
	double height;
	public Child(String name, String address, int age, String phone, double weight, double height) {
		super(name, address, age);
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}
	public Child(String phone, double weight, double height) {
		super();
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}

//	로딩 순서 : 오브젝트 -> 부모 -> 자식
}
