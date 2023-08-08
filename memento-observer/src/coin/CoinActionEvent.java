package src.coin;

import src.manager.*;

public class CoinActionEvent {
    public static final int BUY = 0;
    public static final int SELL = 1;

    private int eventValue; 
    private int eventType;

    public CoinActionEvent(int eventValue, int eventType) {
        this.eventValue = eventValue;
        this.eventType = eventType;
    }

    public void triggerAction(Trader trader, int currentCoinValue) {
        if (eventType == BUY) {
            trader.buyCoin(eventValue, currentCoinValue);
        }
        else if (eventType == SELL) {
            trader.sellCoin(eventValue, currentCoinValue);
        }
    }
}
