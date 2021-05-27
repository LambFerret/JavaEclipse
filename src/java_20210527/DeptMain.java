package java_20210527;

import java.util.ArrayList;

public class DeptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeptDao dao = DeptDao.getInstance();
		int start = 0;
		int len = 10; 
		ArrayList<DeptDto> arr = dao.select(start,len);
		for (DeptDto dto : arr) {
			int no =dto.getno();
			String name = dto.getname();
			String loc = dto.getLoc();
			System.out.printf("%d,%s,%s%n", no, name, loc);
	}

}}
