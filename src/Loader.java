import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Loader {
	
	public static void main(String[] args) {
		
		try {
			
			Document doc = Jsoup.connect("https://www.google.com").get();
			String title = doc.title();
			
			System.out.println("Title: ".concat(title));
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
