package bot;

import java.util.HashMap;

public class SohbetBot {    
    private HashMap<Character, Character> turkishToEnglish = new HashMap<>();

    public SohbetBot() {
        turkishToEnglish.put('ğ', 'g');
        turkishToEnglish.put('ü', 'u');
        turkishToEnglish.put('ş', 's');
        turkishToEnglish.put('ı', 'i');
        turkishToEnglish.put('ö', 'o');
        turkishToEnglish.put('ç', 'c');
        turkishToEnglish.put('Ğ', 'G');
        turkishToEnglish.put('Ü', 'U');
        turkishToEnglish.put('Ş', 'S');
        turkishToEnglish.put('İ', 'I');
        turkishToEnglish.put('Ö', 'O');
        turkishToEnglish.put('Ç', 'C');
    }

    public Character convertCharToEnglish(Character character) {
        if (turkishToEnglish.containsKey(character)) {
            return turkishToEnglish.get(character);
        }
        else {
            return character;
        }
    } 

    public String sor(String soru) {
        String soruSimplified = soru.toLowerCase().chars()
            .mapToObj(c -> convertCharToEnglish((char) c))
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
            .toString();

        SoruCevapReader soruCevapReader = SoruCevapReader.getInstance();
        return soruCevapReader.cevapGetir(soruSimplified);
    }

    public void run() {
        System.out.println("SohbetBot'a hoşgeldiniz!");
        System.out.println("Sohbet etmek için bir soru sorunuz.");
        System.out.println("Çıkmak için 'Güle güle' yazınız.");

        while (true) {
            System.out.print("Soru: ");
            String soru = System.console().readLine();
            if (soru.equals("Güle güle")) {
                System.out.println("SohbetBot: Güle güle!");
                break;
            }
            else {
                String cevap = this.sor(soru);
                System.out.println("SohbetBot: " + cevap);
            }
        }
    }
}
