package java_20210524.echo.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	private String ip;
	private int port;

	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;

	}

//	메세지 입력 메소드
	public String console(String msg) {
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	public void run() {
		Socket socket = null;

		InputStreamReader isr = null;
		OutputStreamWriter osw = null;

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
//			3.ip와 port 로 서버에 접속을 시도한다. 
			socket = new Socket(ip, port);
			System.out.println("서버에 접속되었습니다!");

//			6. socket을 이용해 클라와 통신하는 IO stream 생성.

//			6-1. 클라가 쓰기
			OutputStream out = socket.getOutputStream();
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);
//			6-4 클라가 읽기
			InputStream in = socket.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);

//			쓰기를 반복
			while (true) {
				String message = console("메세지> ");
				bw.write(message);
				bw.newLine();
				bw.flush();
				String readLine = br.readLine();
				System.out.println("서버로부터 받은 메세지 : " + readLine);
			}

		} catch (IOException e) {
			System.out.println("서버와의 접속이 실패했습니다.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	public static void main(String[] args) {
		new EchoClient("192.168.0.28", 3000).run();
	}
}
