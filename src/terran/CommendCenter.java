package terran;

public class CommendCenter extends Buildings {
	static int SCV_number = 0;
	public static SCV makingSCV(){
		SCV_number += 1;
		String scv_name = "SCV" + Integer.toString(SCV_number);
		System.out.println(scv_name + " Served!");
		SCV gotit = new terran.SCV(scv_name);
		return gotit;
	}
}
