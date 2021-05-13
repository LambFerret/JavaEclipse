package java_20210513;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("hello");
		System.out.println(s1.toString());
		String str1 = s1.toString();
		StringBuffer s2 = new StringBuffer("hello");
		String str2 = s2.toString();

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(str1.equals(str2));
		
		StringBuffer sql = new StringBuffer();
		sql.append("select name, age ");
		sql.append("from member ");
		sql.append("where name = '뚱이' ");

		System.out.println(sql);
		sql.setLength(0);;
		sql.append(false);
		System.out.println(sql);
	}
}
