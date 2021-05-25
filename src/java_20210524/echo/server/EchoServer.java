package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private int port;

	public EchoServer(int port) {
		this.port = port;
	}

//	메소드와 구동을 일단 나눈다. -- 단일 책임 
	public void run() {
		ServerSocket serverSocket = null;

		InputStreamReader isr = null;
		OutputStreamWriter osw = null;

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
//			pdf.11-12page 순서 실습 
//			1. serverSocket 인스턴스 생성
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("[서버 화면 입니다.]");
		while (true) {
			System.out.println("클라이언트에 접속중 입니다.");
			try {
//				2. 클라이언트 접속을 기다린다. <<중요>>
//				accept() : 클라이언트 접속을 기다리다가 접속하면 클라랑 통신할 수 있는 Socket개체를 생성해줌
				Socket socket = serverSocket.accept();

//				4. 클라와 통신할 수 있는 socket 객체가 생성된다. 
				InetAddress i = socket.getInetAddress();
				System.out.println("클라이언트에에 접속되었습니다! [" + i.getHostAddress() + "]");

//				5. socket을 이용해 클라와 통신하는 IO stream 생성.

//				6-2 서버가 읽기
				InputStream in = socket.getInputStream();
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);
//				6-3 서버가 쓰기
				OutputStream out = socket.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);

				while (true) {
					String readLine = br.readLine();
					System.out.println("클라이언트 메세지 : " + readLine);
					bw.write(readLine);
					bw.newLine();
					bw.flush();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

//		EchoServer echoServer = new EchoServer(3000);
//		echoServer.run();
//		어짜피 한번만 쓸거면 밑에처럼 간소화 시켜라
		new EchoServer(3000).run();
	}
}
