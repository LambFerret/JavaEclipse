package java_20210520;

import java.io.*;

public class PrintStreamMain {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null; // File
		PrintStream ps1 = null; // 모니터

		ps1 = System.out;
		ps1.println();

		try {
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\git2.pdf");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\git2_copycopy.pdf");
			bos = new BufferedOutputStream(fos);

//			PrintStream
//			1. PrintStream의 매서드는 IOException을 발생시키지 않는다.
//			2. auto flush 기능을 가지고 있다. ==> true
//			3. 

			ps = new PrintStream(bos, true); // true == auto-flush

			int readByte = 0;
			long starts = System.currentTimeMillis();
			while ((readByte = bis.read()) != -1) {
				ps.write(readByte);
			}
			long ends = System.currentTimeMillis();
			System.out.printf("경과시간 : %d밀리초 %n", (ends - starts));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)fis.close();
				if (fos != null)fos.close();
				if (bis != null)bis.close();
				if (ps != null)ps.close();
				if (bos != null)bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
