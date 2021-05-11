package java_20210511;

class A {
	int a;
	A(int a){
		this.a = a;
	}
}
class B extends A{
	B(){
		super(5);
	}
}









public class Main {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	B b = new B();
	System.out.println(b.a);
	}

}
