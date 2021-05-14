package java_20210514;

public class Member {
		private String id;
		private String name;
		private int age;

		public Member(String id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}

		public String getID() {
			return id;
		}

		public void setID(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void getAge(int age) {
			this.age = age;
		}
	

}