import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        String URL = "";
        Document doc = Jsoup.connect(URL).get();
        Element tableInfo = doc.getElementsByClass("").first();
        String href = tableInfo.attr("href");
        System.out.println(href);
        }
}
