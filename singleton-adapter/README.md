# Singleton + Adapter Design Pattern Challenge Question

Bir SohbetBotu class’ı yazın, basit birkaç şeye cevap verebilsin, sor metodu olsun. Verdiği cevapları çektiğiniz class’ı singleton yapın, lazy initialization olsun.
Fakat daha sonra çok daha iyi bir ChatBot class’ı fark ettiniz ama bu ingilizce konuşuyor. Buna Türkçe anlamasını sağlayan Adapter yazın (ingilizce cevap verebilir).
ChatBot classı:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ChatBot {
   private HashMap<String, String> responses;
   public ChatBot() {
       responses = new HashMap<>();
       responses.put("hello", "Hello, how are you?");
       responses.put("how are you", "I'm fine, thanks.");
       responses.put("what is your name", "My name is org.example.ChatBot.");
       responses.put("bye", "Bye!");
   }
   public String ask(String question) {
       String answer = responses.get(question);
       if (answer != null) {
           return answer;
       } else if (question.startsWith("what is ")) {
           String searchTerm = question.substring(8);
           try {
               String wikiSearchUrl = "https://en.wikipedia.org/wiki/" + URLEncoder.encode(searchTerm, "UTF-8");
               String content = fetchPageContent(wikiSearchUrl);
               String firstParagraph = extractFirstParagraph(content);
               if (firstParagraph != null) {
                   return firstParagraph;
               } else {
                   return "No content found on the Wikipedia page.";
               }
           } catch (IOException e) {
               return ("An error occurred while connecting to Wikipedia: " + e.getMessage());
           }
       } else {
           return ("Sorry, I don't understand.");
       }
   }
   private String fetchPageContent(String url) throws IOException {
       StringBuilder response = new StringBuilder();
       URL wikiURL = new URL(url);
       HttpURLConnection conn = (HttpURLConnection) wikiURL.openConnection();
       conn.setRequestMethod("GET");
       conn.setRequestProperty("User-Agent", "Mozilla/5.0");


       try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
           String line;
           while ((line = reader.readLine()) != null) {
               response.append(line);
           }
       }
       return response.toString();
   }
   private String extractFirstParagraph(String content) {
       // Wikipedia uses <p> tags for paragraphs, so we can extract the first paragraph using a simple regex
       Pattern pattern = Pattern.compile("<p>(.*?)</p>");
       Matcher matcher = pattern.matcher(content);


       if (matcher.find()) {
           // Remove any HTML tags from the paragraph text using regex
           String firstParagraph = matcher.group(1).replaceAll("<.*?>", "");
           return firstParagraph;
       }
       return null;
   }
}
