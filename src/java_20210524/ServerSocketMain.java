package java_20210524;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketMain {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
	 serverSocket = new ServerSocket(port);
		}catch(IOException e) {
			System.err.println(port + "번호가 사용중입니다.");
		}
	}
}
