
/**
 * Write a description of LinkFind here.
 * Finding specific Link from Web adddress.
 * 
 * @author (Md. Samiul haque) 
 * @version (tester Link Findr)
 */
import edu.duke.*;
public class LinkFind {
    public void printUrls(String url) {
        URLResource myurl = new URLResource(url);
        for(String word : myurl.words()) {
            if(word.toLowerCase().indexOf("youtube.com") != -1) {
                int quoteIndex = word.indexOf("\"");
                int lastQouteIndex = word.indexOf("\"", quoteIndex+1);
                System.out.println(word.substring(quoteIndex+1, lastQouteIndex));
                
            }
        }
    }
    
    public void testUrl() {
        printUrls("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
    }
    
    public static void main() {
       LinkFind url = new LinkFind();
        url.testUrl();
    }
}