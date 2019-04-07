import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        String mangaURL = "https://mangakakalot.com/";
        Document doc = Jsoup.connect(mangaURL).get();
        Element tableInfo = doc.getElementsByClass("sts sts_1").first();
        String href = tableInfo.attr("href");
        System.out.println(href);
        }
}
