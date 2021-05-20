package java_20210520;

import java.io.*;

public class InputStreamReaderMain {

	public static void main(String[] args) throws IOException {
		
		
		/*
		 1번째 방법
		InputStream in = System.in; // source가 키보드인 경우
		byte[] b = new byte[100];
		boolean cont = true;
		while (cont) {
			System.out.print("이곳에 입력하세요: ");
			int readByteCount = in.read(b);
			String message = new String(b,0,readByteCount);
			System.out.print(new String(b, 0, readByteCount));
			if(message != null && message.trim().equals("quit")) cont = false;
			System.out.println(message);
		}
		*/
		
		
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw = new FileWriter("C:\\Users\\user\\eclipse-workspace\\JavaEclipse\\src\\18\\message.java",true);
		BufferedWriter bw = new BufferedWriter(fw);
		String readLine = null;
		System.out.print("입력쓰: ");
		while((readLine = br.readLine())!= null ) {
			if(readLine != null && readLine.equals("ex")) break;
			System.out.println(readLine);
			bw.write(readLine);
			bw.newLine();
			System.out.print("입력쓰: ");
		}
		bw.flush();
	}

}
