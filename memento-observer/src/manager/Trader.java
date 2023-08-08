package src.manager;

import java.util.ArrayList;
import java.util.List;

import src.coin.*;

public class Trader {
    private int traderId;
    private int balance;
    private int muhendisCoinCount;
    private CoinActionEvent sellCoinActionEvent;
    private CoinActionEvent buyCoinActionEvent;
    private List<CoinAction> coinActions;

    private List<TraderSnapshot> history = new ArrayList<>();

    public Trader(int id, int balance) {
        this.traderId = id;
        this.balance = balance;
        this.muhendisCoinCount = 0;
        this.coinActions = new ArrayList<>();
    }

    public void buyCoin(int coinToBuy, int currentCoinValue) {
        if (balance < coinToBuy * currentCoinValue) {
            System.out.println("Not enough balance to buy coin for trader: " + traderId);
            return;
        }
        balance -= coinToBuy * currentCoinValue;
        muhendisCoinCount += coinToBuy;
    }

    public void sellCoin(int coinToSell, int currentCoinValue) {
        if (muhendisCoinCount < coinToSell) {
            System.out.println("Not enough coin to sell for trader: " + traderId);
            return;
        }
        balance += coinToSell * currentCoinValue;
        muhendisCoinCount -= coinToSell;
    }

    public void setSellCoinActionEvent(int sellCoinCount) {
        this.sellCoinActionEvent = new CoinActionEvent(sellCoinCount, CoinActionEvent.SELL);
    }

    public void setBuyCoinActionEvent(int buyCoinCount) {
        this.buyCoinActionEvent = new CoinActionEvent(buyCoinCount, CoinActionEvent.BUY);
    }

    public void addCoinAction(CoinActionTrigger coinActionTrigger) {
        if (sellCoinActionEvent == null || buyCoinActionEvent == null) {
            System.err.println("Coin action event is not set for trader: " + traderId);
            return;
        }
        CoinAction coinAction;
        if (coinActionTrigger.getTriggerType() == CoinActionTrigger.BELOW) {
            coinAction = new CoinAction(coinActionTrigger, buyCoinActionEvent);
        }
        else {
            coinAction = new CoinAction(coinActionTrigger, sellCoinActionEvent);
        }
        this.coinActions.add(coinAction);
        MuhendisCoinManager.getInstance().addListener(coinAction, this);

        history.add(getSnapshot());
    }

    public void undo() {
        if (history.size() == 0) {
            return;
        }
        history.get(history.size() - 1).restore();
        history.remove(history.size() - 1);
    }

    public TraderSnapshot getSnapshot() {
        return new TraderSnapshot(this);
    }

    public List<CoinAction> getCoinActions() {
        return coinActions;
    }

    public void setCoinActions(List<CoinAction> coinActions) {
        MuhendisCoinManager muhendisCoinManager = MuhendisCoinManager.getInstance();
        for (CoinAction coinAction : this.coinActions) {
            muhendisCoinManager.removeListener(coinAction, this);
        }
        this.coinActions = coinActions;
        for (CoinAction coinAction : coinActions) {
            muhendisCoinManager.addListener(coinAction, this);
        }
    }

    public int getTraderId() {
        return traderId;
    }

    public String toString() {
        return "Trader: " + traderId + ", Balance: " + balance + ", MuhendisCoin Count: " + muhendisCoinCount;
    }
}
