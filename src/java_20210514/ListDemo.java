package java_20210514;

import java.util.*;

class Product{
	private int number;
	private String name;
	private double price;
	public Product(int number, String name, double price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
public class ListDemo {
	public static Product selectByNumber() {
		return new Product(1,"신발",2000);
	}
	public static ArrayList select() {
		ArrayList list = new ArrayList();
		list.add(new Product(2,"라면",1000));
		list.add(new Product(3,"겨란",5000));
		list.add(new Product(4,"과자",500));
		list.add(new Product(5,"우유",3000));
		return list;
		
	}
// 리스트는 set와 다르게 중복O 순서O
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		이거안씀X
		Vector ls1 = new Vector();
		ls1.add(433);
		ls1.add(43);
		ls1.add(33);
		ls1.add(433);
		
//		이거만씀O
		System.out.println();
		ArrayList ls2 = new ArrayList();
		ls2.add(433);
		ls2.add(43);
		ls2.add(33);
		ls2.add(433);
		
//		이거안씀X
		System.out.println();
		LinkedList ls3 = new LinkedList();
		ls3.add(433);
		ls3.add(43);
		ls3.add(33);
		ls3.add(433);
		
		for (int i=0; i<ls2.size();i++) {
			int temp = (int)ls2.get(i);
			System.out.println(temp);
		}
		Product pro = selectByNumber();
		System.out.printf("%d, %s, %.0f %n", pro.getNumber(), pro.getName(), pro.getPrice());
		System.out.println();
		ArrayList list2 = select();
		for(int i =0; i<list2.size();i++) {
			Product p = (Product)list2.get(i);
			System.out.printf("%d, %s, %.0f %n", p.getNumber(), p.getName(), p.getPrice());
		}
	}

}
