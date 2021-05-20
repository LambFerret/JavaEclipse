package java_20210520;

import java.io.*;

public class PrintWriterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {

			fr = new FileReader("C:\\dev\\test\\2021\\05\\18\\FileMain.java");
			fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\FileMain_copy.java");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);

			pw = new PrintWriter(bw, true);

//			<<<printWriter 방법>>>
			String readLine = null;
			while ((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				pw.println(readLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
				if (pw != null)
					pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
