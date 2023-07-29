
import bot.*;

public class Main {
    public static void main(String[] args) {
        SohbetBot sohbetBot = new SohbetBot();
        sohbetBot.run();

        ChatBot chatBot = new ChatBotAdapter();
        chatBot.ask("merhaba");
    }
}
