package src.manager;

import java.util.List;

import src.coin.*;

public class TraderSnapshot {
    private Trader trader;
    private List<CoinAction> coinActions;

    public TraderSnapshot(Trader trader) {
        this.trader = trader;
        this.coinActions = trader.getCoinActions();
    }

    public void restore() {
        trader.setCoinActions(coinActions);
    }
}
