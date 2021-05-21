package java_20210521;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		URL url = new URL("https://imgnews.pstatic.net/image/056/2021/05/21/0011048537_001_20210521151302904.jpg?type=w647");
		URL url = new URL("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=056&aid=0011048537");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println("protocol :" +protocol);
		System.out.println("host :" +host);
		System.out.println("port :" +port);
		System.out.println("path :" +path);
		System.out.println("query :" +query);
		System.out.println("ref :" +ref);
		/* url source가 img인 경우
		InputStream in = url.openStream();
		int readByteCount = 0;
		byte[] readBytes = new byte[1024*8];
		FileOutputStream fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\test.jpg");
		while((readByteCount = in.read(readBytes))!= -1) {
			fos.write(readBytes, 0 , readByteCount);
		}fos.close();
		*/
		
		
		
//		url source가 html인경우
		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in,"euc-kr");
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine())!= null) {
			System.out.println(readLine);
		}
		
		
	}

}
