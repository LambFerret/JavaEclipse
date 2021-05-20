package java_20210520;

import java.net.URL;
import java.io.*;

public class ScanningMain {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://jamesdreaming.tistory.com/99");
		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in,"utf-8");

		FileWriter fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\tistory.html");
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = new BufferedWriter(fw);

		String readLine = null;
		while ((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			bw.write(readLine);
			bw.newLine();
		}
		bw.flush();

	}
}
