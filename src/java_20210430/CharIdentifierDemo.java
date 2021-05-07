package java_20210430;
import java.util.ArrayList;
public class CharIdentifierDemo {
	public static void main(String[] args) {
		char c1 = '\uc815';
		char c2 = '\ud604';
		char c3 = '\uc11d';
		char c4 = '\\';
		byte b1 = 29;
		byte b2 = 100;
		int b3 = b1+b2;
		String c5 = "\\";
		System.out.print(c1);
		
		System.out.print(c2 + c3);
		System.out.print(c3);
		System.out.print(c4);
		System.out.print(c4);
		System.out.print("abc"+1+2+3);
		System.out.print("\n" + c5+"\n");
		System.out.println(b1+ b2);
		System.out.println(c5.getClass().getName());
	}

}
