package java_20210430;

//public class NintyNineBottles {
//	public static void main(String args[]) {
//		String s = "s";
//		for (int beers = 10; beers > -1;) {
//			System.out.print(beers + " bottle" + s + " of beer on the wall, ");
//			System.out.println(beers + " bottle" + s + " of beer, ");
//			if (beers == 0) {
//				System.out.print("Go to the store, buy some more, ");
//				System.out.println("99 bottles of beer on the wall.\n");
//				System.exit(0);
//			} else
//				System.out.print("Take one down, pass it around, ");
//			s = (--beers == 1) ? "" : "s";
//			System.out.println(beers + " bottle" + s + " of beer on the wall.\n");
//		}
//	}
//}

public class NintyNineBottles {
	public static void main(String args[]) {
		String 들 = "들";
		for (int 술 = 10;술>-1;) {
			System.out.println(술 +"병"+들+"이 있네요");
			if (술 == 0) {
				System.out.println("없네 사와야지");
				System.exit(0);
			} else { 
				들 = (--술 <=1)? "" : "들";
				System.out.println(술 +"병"+들+"이 있네요");
				
			}
		}
	}
}