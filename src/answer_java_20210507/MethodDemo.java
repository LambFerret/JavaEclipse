package answer_java_20210507;

public class MethodDemo {
	public void print(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		boolean isLeafYear = isLeafYear(year);
		if(isLeafYear) {
			monthArray[1] = 29;
		}
		for(int i=1;i<=monthArray[month-1];i++) {
			System.out.print(i+"\t");
			if(i%7==0) System.out.println();
		}
	}
	
	
	
	public int[] ascending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				
			}
		}
		return array;
	}
	public boolean isLeafYear(int year) {
		return year%4==0 && year%100 != 0 || year%400==0;
	}
	
	//first, second => 매개변수(parameter)
	public int plus(int first, int second) {
		return first + second;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo m = new MethodDemo();
		int sum = m.plus(10, 20);//10, 20 => 인자(arguments)
		System.out.printf("%d%n", sum);
		
		boolean leafYear = m.isLeafYear(2100);
		System.out.printf("%s %n", leafYear);
		
		int[] test = {10,20,1,30,4,89,100,25};
		int[] afterTest = m.ascending(test);
		for(int i=0;i<afterTest.length;i++) {
			System.out.print(afterTest[i]+"\t");
		}
		
		System.out.println();
		
		m.print(2020,2);
		
		
	}

}
