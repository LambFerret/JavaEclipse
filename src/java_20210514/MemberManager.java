package java_20210514;

import java.util.ArrayList;

public class MemberManager  {
	private ArrayList list;
	public MemberManager() {
		list = new ArrayList();
	}
	public void insert(String id, String name, int age) {
		list.add(new Member(id,name,age));
	}
	public void delete (String id) {
		for (int i =0;i<list.size();i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getID())) {
				list.remove(i);
				break;
			}
		}
		
	}
	public void update(String id, String name, int age) {
		delete(id);
		insert(id,name,age);
		
	}
	public void select() {
		for(int i=0; i<list.size();i++) {
			Member m2 = (Member)list.get(i);

			System.out.printf("%d, %s, %.0f %n", m2.getID(), m2.getName(), m2.getAge());
		}
	}
	public Member select(String id) {
		Member member = null;
		for(int i =0 ;i<list.size();i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getID())) {
				member=m;
				break;
			}
		}
		return member;
	}
	
	
}
