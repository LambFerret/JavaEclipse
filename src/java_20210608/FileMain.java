package java_20210608;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		File f = new File("C:\\dev\\test\\2021\\05\\18\\git2.pdf");
		
		long num = f.length();
		System.out.printf("%d	%n", num/1024);
		
		String filename = f.getName();
		
		String name = filename.substring(0, filename.lastIndexOf("."));
		System.out.printf("%s%n", name);
		
		
		String extension = filename.substring(filename.lastIndexOf("."));
		
		System.out.printf("%s%n", name);
		
		String parentPath = f.getParent();
		System.out.printf("%s %n", parentPath);
		
		File f2 = new File(parentPath, "git." +extension);
		
		// TODO Auto-generated method stub

	}

}
