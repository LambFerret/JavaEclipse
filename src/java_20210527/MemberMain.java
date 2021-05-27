package java_20210527;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDAO dao = MemberDAO.getInstance();
		
		/*
		 * 여긴 insert, delete, update 사용방법
		int num = 16;
		String name = "유령 갑판원";
		String addr = "유령선";
		MemberDTO dto = new MemberDTO(num, name, addr);
		dao.delete(dto);
		*/
		MemberDTO dto2 = new MemberDTO(3,"다람이","텍사스");
		dao.update(dto2);
		for (MemberDTO dto :  dao.select(0,3)) {
			int num =dto.getNum();
			String name = dto.getName();
			String addr = dto.getAddr();
			System.out.printf("%d,%s,%s%n", num, name, addr);
		}
		
	}
}
