package java_20210518;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutStreamMain {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\git2.pdf");
		fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\git2-copy.pdf"); // 이거는 파일경로없을때 exception을 지어둠
		/*
		 * int readByte = 0; long start = System.currentTimeMillis();
		 * 
		 * while((readByte = fis.read()) != -1) { fos.write(readByte); }
		 * 
		 * long end = System.currentTimeMillis();
		 * System.out.printf("경과시간 : %d초 %n",(end-start)/1000);
		 */
		long start = System.currentTimeMillis();
		int readByteCount = 0;
		byte[] readBytes = new byte[1024 * 1];
		while ((readByteCount = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteCount);
		}
		long end = System.currentTimeMillis();
		System.out.printf("경과시간 : 0.0%d초 %n", (end - start));

		fis.close();
		fos.close();

	}
}
