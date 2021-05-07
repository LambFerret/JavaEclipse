package terran;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		<<boolean의 변수 이름은 관례상 is가 붙는다>>>
		boolean isGame = true;
		while (isGame == true) {
			System.out.println("SCV");
			String input = sc.next();
			byte clicked = 0;
			while (clicked == 0) {
				switch (input) {
				case "CS":
					

					break;

				default:
					break;
				}
			}
		}

	}

}
