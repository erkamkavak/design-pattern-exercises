package bot;

import com.gtranslate.Translator;
import com.gtranslate.Language;

public class ChatBotAdapter extends ChatBot {
    public ChatBotAdapter() {

    }

    private String translateToEnglish(String text) {
        Translator translate = Translator.getInstance();
        String translated = translate.translate(text, Language.TURKISH, Language.ENGLISH); 
        return translated;
    }

    private String translateToTurkish(String text) {
        Translator translate = Translator.getInstance();
        String translated = translate.translate(text, Language.ENGLISH, Language.TURKISH);
        return translated;
    }

    @Override
    public String ask(String questionInTurkish) {
        String questionTranslated = translateToEnglish(questionInTurkish);
        String answerInEnglish = super.ask(questionTranslated);
        String answerTranslated = translateToTurkish(answerInEnglish);
        return answerTranslated;
    }
}
