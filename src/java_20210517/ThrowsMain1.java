package java_20210517;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsMain1 {
	public static void m() throws FileNotFoundException {
		FileReader fr = new FileReader("");
	}

	public static void m1(String path) throws FileNotFoundException {
		FileReader fr = new FileReader(path);
	}

	public static void main(String[] args) throws FileNotFoundException {
//		m();
		try {

			String path = args[0];
			m1(path);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("경로와 파일명을 정확히 입력하세요.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("기입된 파일명이 없습니다.");
		}
	}
}
