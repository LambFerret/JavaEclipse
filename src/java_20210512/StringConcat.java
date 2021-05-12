package java_20210512;




public class StringConcat {

	public static String reverse(String str) {
		String temp = "";
		for (int i = 0;i<(str.length());i++) {
//			System.out.println(str.substring(str.length()-i,str.length()));
			temp = temp.concat(str.substring(str.length()-(i+1),str.length()-i));
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		String str5 = reverse("beautiful");
		System.out.println(str5);
		
	}
}
