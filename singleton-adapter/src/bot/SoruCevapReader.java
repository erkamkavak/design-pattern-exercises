package bot;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class SoruCevapReader {
    private static SoruCevapReader instance;

    private JSONObject soruCevapJson;

    private SoruCevapReader() {
        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader(getClass().getResource("SoruCevap.json").getPath())) {
            soruCevapJson = (JSONObject) parser.parse(reader);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static SoruCevapReader getInstance() {
        // Lazy initialization
        if (instance == null) {
            instance = new SoruCevapReader();
        }
        return instance;
    }

    public String cevapGetir(String soru) {
        if (soruCevapJson != null && soruCevapJson.containsKey(soru)) {
            return (String) soruCevapJson.get(soru);
        }
        else {
            return "Bilmiyorum.";
        }
    }
}
