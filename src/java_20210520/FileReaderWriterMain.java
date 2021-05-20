package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {

			fr = new FileReader("C:\\dev\\test\\2021\\05\\18\\FileMain.java");
			fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\FileMain_copy.java"); //뒤에 파라미터로 true를 붙히면 이어서적는다.
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			/*
			 1번 방법
			int readChar = 0;
			// read : 한개의 문자를 읽는다.
			while ((readChar = fr.read()) != -1) {
				System.out.print((char) readChar);
				// write : 한개의 문자를 쓴다.
				fw.write(readChar);
			}
			
			*/
			
//			  2번 방법
//			int readCharCount = 0;
//			char[] readChars = new char[1024];
//			while ((readCharCount = fr.read(readChars)) != -1) {
//				System.out.println(readCharCount);
//				fw.write(readChars, 0 , readCharCount);
//			}

//			3번방법
			String readLine = null;
			while ((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				bw.write(readLine);
				bw.newLine();
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
