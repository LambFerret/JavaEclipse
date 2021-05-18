package java_20210518;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileMain {
	public static String format(File f) {

		long lastModified = f.lastModified();
		Calendar cal = Calendar.getInstance(); // 추상클래스 가져오는방법
		cal.setTimeInMillis(lastModified);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String format = sdf.format(cal.getTime());
		System.out.println(format);

		return format;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\dev\\test\\2021\\05\\18");
		if (f1.mkdirs()) {
			System.out.println("디렉토리 생성되었습니다.");
		} else {
			System.out.println("이미 존재합니다.");
		}
		File f2 = new File("C:\\dev\\test\\2021\\05\\18\\", "git.pdf");
		File f3 = new File("C:\\dev\\test\\2021\\05\\18\\git2.pdf");
		long len = f2.length();
		System.out.printf("%,d %n", len / 1024);
		boolean isFile = f2.isFile();
		if (isFile) {
			String path = f2.getPath();
			if (path.endsWith(".zip")) {
				System.out.println("압축파일입니다.");
			} else if (path.endsWith(".pdf")) {
				System.out.println("pdf파일입니다.");
			} else if (path.endsWith(".txt")) {
				System.out.println("텍스트파일입니다.");
			} else {
				System.out.println("None");
			}
			System.out.println(path);
			System.out.println("파일입니다");
		} else {
			System.out.println("파일아닙니다.");
		}
		f2.renameTo(f3);
//		f3.renameTo(f2);
		String parent = f3.getParent();
		String name = f3.getName();
		String path = f3.getPath();
		System.out.println(parent + name + path);
//		f3.delete();
		format(f3);
		File f5 = new File("C:\\Users\\user\\eclipse-workspace");

		for (String i : f5.list()) {
			System.out.println(i);
		}
		File[] files = f5.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				String lastModified = format(f);
				String Name = f.getName();
				System.out.printf("%s, %s ㅍㅍㅍㅍㅍㅍㅍㅍㅍㅍㅍㅍㅍㅍㅍㅍㅍㅍ폴더 %n", Name, lastModified);

			} else if (f.isFile()) {
				String lastModified = format(f);
				String Name = f.getName();
				System.out.printf("%s, %s 파파파파파파파ㅏ파파파일 %n", Name, lastModified);
			}
			System.out.println(f);

		}
	}
}
