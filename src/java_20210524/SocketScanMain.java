package java_20210524;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketScanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		for (int port = 1; port < 1025; port++) {
			try {
				socket = new Socket("127.0.01", port);
				System.out.println(port + "생성됨");
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				System.out.println(port + "호스트가 생성되지 않음");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(port + "생성되지 않음");
			}
		}
	}
  }
