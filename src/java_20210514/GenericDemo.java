package java_20210514;
import java.util.*;
public class GenericDemo {
// 제너릭을 쓰면 -> 안정성 업 -> 인핸스 포 	문을 쓸 수 있음 
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		for(int i=0;i<list.size();i++) {
			String value = (String)list.get(i);
			System.out.println(value);
		}
		for (String value : list) {
			System.out.println(value);
		}
//		따라서 매개변수로 인터페이스,추상클래스 타입을 선언하면 자손 클래스를 모두
//		사용할 수 있기 때문에 코드의 효율성을 증대시킬 수 있다. 
		
	}
}
