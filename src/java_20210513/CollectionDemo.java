package java_20210513;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("1");
		set.add("2");
		set.add("33");
		set.add("4");
		set.add("1");
		Iterator i = set.iterator();
//		set,listcolection : interface 
//		hasnext = iterator에 출력할 객체가 존재하는지 판단하는 매서드
		while (i.hasNext()) {
			String temp = (String) i.next(); // 해당객체를 가져옴
			System.out.println(temp);
		}
		System.out.println();

		// TODO Auto-generated method stu
		HashSet set2 = new HashSet();
		set2.add("1");
		set2.add("2");
		set2.add("33");
		set2.add("4");
		set2.add("1");
//		hashset은 자체적으로 출력할 수 없기에 iterator로 변환후 출력
		Iterator i2 = set2.iterator();
//		set,listcolection : interface 
//		hasnext = iterator에 출력할 객체가 존재하는지 판단하는 매서드
		while (i2.hasNext()) {
			String temp2 = (String) i2.next(); // 해당객체를 가져옴
			System.out.println(temp2);

		}
		System.out.println();
		TreeSet set3 = new TreeSet();
		set3.add(1);
		set3.add(2);
		set3.add(33);
		set3.add(4);
		set3.add(1);
		Iterator i3 = set3.iterator();
//		set,listcolection : interface 
//		hasnext = iterator에 출력할 객체가 존재하는지 판단하는 매서드
		while (i3.hasNext()) {
			int temp3 = (int) i3.next(); // 해당객체를 가져옴
			System.out.println(temp3);
		}
		System.out.println();
	

	TreeSet lottoSet = new TreeSet();

	while(true)
	{
		int random = (int) (Math.random() * 45) + 1;
		lottoSet.add(random);
		if (lottoSet.size() == 6)
			break;
	}

	Iterator i4 = lottoSet.iterator();
	while(i4.hasNext())
	{
		Integer temp4 = (Integer)i4.next(); // 해당객체를 가져옴
		System.out.println(temp4);
	}
//			결론 : hashset은 중복X , 순서X treeset은 중복X, 순서O
}}
