package src;

import src.coin.*;
import src.manager.*;

public class Main {
    public static void main(String[] args) {
        int[] muhendisCoinValues = {100, 104, 98, 
            97, 87, 92, 85, 95, 86, 89, 90, 81, 89, 80, 88, 81, 
            80, 82, 73, 79, 74, 84, 94, 101, 104, 111, 120, 122,
            121, 118, 127, 119, 109, 115, 122, 128, 126, 129, 127,
            118, 109, 113, 104, 104, 98, 99, 107, 102, 109, 118, 108,
            117, 120, 128, 132, 142, 146, 146, 151, 145, 147, 138,
            144, 150, 150, 157, 163, 167, 177, 172, 179, 171, 166,
            176, 170, 161, 152, 142, 141, 143, 135, 140, 132, 138,
            143, 140, 132, 134, 143, 140, 133, 127, 130, 136, 130, 139, 148, 153, 143, 142, 133};

        MuhendisCoinManager coinManager = MuhendisCoinManager.getInstance();
        MuhendisCoin muhendisCoin = new MuhendisCoin(muhendisCoinValues);
        Trader kullanici1 = coinManager.addTrader();
        Trader kullanici2 = coinManager.addTrader();
        Trader kullanici3 = coinManager.addTrader();
        kullanici1.setBuyCoinActionEvent(1);
        kullanici1.setSellCoinActionEvent(1);
        kullanici2.setBuyCoinActionEvent(3);
        kullanici2.setSellCoinActionEvent(2);
        kullanici3.setBuyCoinActionEvent(5);
        kullanici3.setSellCoinActionEvent(5);

        kullanici1.addCoinAction(new CoinActionTrigger(95, CoinActionTrigger.BELOW));
        muhendisCoin.passDays(2);
        kullanici2.addCoinAction(new CoinActionTrigger(100, CoinActionTrigger.ABOVE));
        muhendisCoin.passDays(4);
        kullanici3.addCoinAction(new CoinActionTrigger(90, CoinActionTrigger.BELOW));
        kullanici3.addCoinAction(new CoinActionTrigger(105, CoinActionTrigger.ABOVE));
        muhendisCoin.passDays(1);
        kullanici1.addCoinAction(new CoinActionTrigger(100, CoinActionTrigger.ABOVE));
        kullanici1.addCoinAction(new CoinActionTrigger(80, CoinActionTrigger.BELOW));
        muhendisCoin.passDays(2);
        kullanici2.addCoinAction(new CoinActionTrigger(90, CoinActionTrigger.ABOVE));
        muhendisCoin.passDays(10);
        kullanici2.undo();
        kullanici1.addCoinAction(new CoinActionTrigger(110, CoinActionTrigger.ABOVE));
        muhendisCoin.passDays(20);
        kullanici1.undo();
        muhendisCoin.passDays(4);
        kullanici3.addCoinAction(new CoinActionTrigger(120, CoinActionTrigger.ABOVE));
        kullanici3.addCoinAction(new CoinActionTrigger(100, CoinActionTrigger.BELOW));
        muhendisCoin.passDays(10);
        kullanici1.undo();
        muhendisCoin.passDays(20);
        kullanici2.addCoinAction(new CoinActionTrigger(150, CoinActionTrigger.ABOVE));
        kullanici2.addCoinAction(new CoinActionTrigger(120, CoinActionTrigger.BELOW));
        muhendisCoin.passDaysUntilEnd();

        System.out.println(kullanici1);
        System.out.println(kullanici2);
        System.out.println(kullanici3);
    }
    
}
