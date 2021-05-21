package java_20210521;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://www.imbc.com/";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
			System.out.println("성공");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		Elements elements = doc.select(".notice-list li");
		for (Element element1 : elements) {
			System.out.println(element1.text());
		}
	}

}
