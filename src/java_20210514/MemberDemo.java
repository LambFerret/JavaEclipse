package java_20210514;

public class MemberDemo {
	public static void main(String[] args) {
		MemberManager m = new MemberManager();
		m.insert("aaa", "뚱이", 10);
		m.insert("bbb", "징징이", 13);
		m.insert("ccc", "집게사장", 20);
		m.insert("ddd", "다람이", 8);
		m.update("ccc", "스폰지밥", 9);
		
		Member m3 = m.select("ccc");
		System.out.printf("%d, %s, %.0f %n", m3.getID(), m3.getName(), m3.getAge());
	}
}
