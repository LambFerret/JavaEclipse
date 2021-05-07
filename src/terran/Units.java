package terran;

public class Units {
	int maxhealth;
	String name;
	int health = maxhealth;
	int attackPower;
	int gathering;
	int building;
	int healpower;
	
	public void attack(Units target) {
		target.health -= this.attackPower;
		if (target.health <1) {
			System.out.println(target.name +"dead!");
		}			
	}
}
