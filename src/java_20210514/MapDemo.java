package java_20210514;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		//HashMap: key값이 유일해야하고 value의 중복은 허용
		HashMap map = new HashMap();
		map.put("a", "뚱이");
		map.put("b", "징징이");
		map.put("c", "다람이");
		
		String value1 = (String)map.get("a");
		String value2 = (String)map.get("b");
		String value3 = (String)map.get("c");
		

		System.out.printf("%s, %s, %s %n", value1, value2, value3);
		Set keySet = map.keySet();
		Iterator i = keySet.iterator();
		while (i.hasNext()) {
			String key = (String)i.next();
			String value = (String)map.get(key);

			System.out.printf("%s : %s %n", key, value);
			
		}
	}
}
