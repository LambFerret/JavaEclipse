package java_20210518;

import java.io.*;

public class BufferedInOutputStreamMain {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46-1.zip");

		//1번째 방법
//			int readByte = 0;
//			long start = System.currentTimeMillis();
//			while ((readByte = fis.read()) != -1) {
//				fos.write(readByte);
//			}
//			long end = System.currentTimeMillis();
//			System.out.printf("경과시간 : %d초 %n", (end - start)/1000);
			
			
			
		//2번째 방법
			/*
			 * bis = new BufferedInputStream(fis); bos = new BufferedOutputStream(fos);
			 * 
			 * int readBytes = 0; long starts = System.currentTimeMillis(); while
			 * ((readBytes = bis.read()) != -1) { bos.write(readBytes); } long ends =
			 * System.currentTimeMillis(); bos.flush(); System.out.printf("경과시간 : %d밀리초 %n",
			 * (ends - starts));
			 */
			
		//3번째 방법
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*10];
			long starts = System.currentTimeMillis();
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes,0,readByteCount);
			}
			long ends = System.currentTimeMillis();
			System.out.printf("경과시간 : %d밀리초 %n",(ends - starts));
			
			StringBuilder sb = new StringBuilder();
			sb.append("212");
			sb.append("212");
			sb.append("212");
			sb.append("212");
			sb.append("212");
			sb.append("212");
			sb.append("212");
			System.out.println(sb);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
