package java_20210513;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = { 'h', 'e', 'l', 'l', 'o' };
		String str = new String(c);
		System.out.println(str);
		char c1 = str.charAt(1);
		System.out.println(c1);
//		문자열연결
		String s1 = str.concat(".zip");
		System.out.println(s1);
		if (s1.endsWith("zip")) {
			System.out.println("zip파일");
		} else if (str.endsWith("doc")) {
			System.out.println("word파일");
		} else {
			System.out.println("파일");
		}
		String url = new String("https://www.naver.com");
		String path = new String("news/board.do?id=123&cat=1");
		if (path.startsWith("/news")) {
			System.out.println("뉴스");

		} else if (path.startsWith("sports"))
			System.out.println("스포츠 뉴스");
		else
		{
			System.out.println("존재하지않습니다");
		}
//		equals() -> 문자열 비교
//		equalsIgnoreCase() -> 대소문자 구분없이 비교
		String m1 = new String("hello");
		String m2 = new String("HELLO");
		if (m1.equals(m2)) {
			System.out.println("true");
		}else { System.out.println("false");}
		String m3 = new String("안녕하세요");
		byte[] b = m3.getBytes();
		System.out.println(b.length);
		System.out.println(m3.indexOf("l"));
		String m5 = new String("a.b.c.zip");
		int lastIndexOf = m5.lastIndexOf(".");
		System.out.println(lastIndexOf);
		
		System.out.println(m5.substring(0,6));
		System.out.println(m5.substring(m5.indexOf(".")+1));
		String m6 = "010-3122-1224";
		System.out.println(m6.substring(m6.lastIndexOf("-")+1));
		System.out.println(m6.substring(m6.indexOf("-")+1, m6.lastIndexOf("-")  ));
		System.out.println(m6.substring(m6.lastIndexOf("-")+1));
		String m7 = 123+"";
		int a1 = Integer.parseInt(m6.substring(0,1));
		System.out.println(a1);
		
		String m9 = m6.replaceAll("-", "=");
		String m12 = m2.toLowerCase();
		System.out.println(m1.equals(m12));
		System.out.println(m1 == m12);
		
//		어레이 내의 요소들 = "토큰"
		String[] temp = m6.split("-");
		for (String a : temp) {
			System.out.println(a);
		}
		double d = 123123.123;
		String m13 = String.format("%,.3f", d);
		System.out.println(m13);
		
		System.out.format("%n%s%n%s",m13,m13);
		
		
		
	}
}