package terran;
import neutral.Mineral;

public class SCV extends Units {
	static int mineralNum = 0;
	static int gasNum = 0;
	public SCV(String name) {
		this.name = name;
		this.attackPower = 3;
		this.building =5;
		this.maxhealth= 30;
		this.gathering = 5;
	}
	
	public void gathering(Mineral mineral) {
		mineral.health -= this.gathering;
		mineralNum += this.gathering;
	}
	
	public void building(Buildings building) {
		for (int i = 0;i< building.maxhealth;i+=this.building) {
			System.out.println(i);
		System.out.println(building.name + "완성");
		}
	}
}
