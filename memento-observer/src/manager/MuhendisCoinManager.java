package src.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import src.coin.*;

public class MuhendisCoinManager {
    private HashMap<CoinAction, List<Integer>> coinActionListeners;
    private HashMap<Integer, Trader> traders;

    private static MuhendisCoinManager instance;

    private MuhendisCoinManager() {
        this.coinActionListeners = new HashMap<>();
        this.traders = new HashMap<>();
    }

    public static MuhendisCoinManager getInstance() {
        if (instance == null) {
            instance = new MuhendisCoinManager();
        }
        return instance;
    }

    public Trader addTrader() {
        Trader trader = new Trader(traders.size(), 1000);
        traders.put(trader.getTraderId(), trader);
        return trader;
    }

    public void addListener(CoinAction action, Trader listener) {
        if (!coinActionListeners.containsKey(action)) {
            coinActionListeners.put(action, new ArrayList<>());
        }
        coinActionListeners.get(action).add(listener.getTraderId()); 
    }

    public void removeListener(CoinAction action, Trader listener) {
        if (!coinActionListeners.containsKey(action) || !coinActionListeners.get(action).contains(listener.getTraderId())) {
            return;
        }
        coinActionListeners.get(action).removeIf(id -> id == listener.getTraderId());
    }

    public void notifyListeners(MuhendisCoin coin) {
        for (CoinAction action : coinActionListeners.keySet()) {
            if (action.checkActionTriggered(coin.getCurrentValue())) {
                for (int listenerId : coinActionListeners.get(action)) {
                    Trader listener = traders.get(listenerId);
                    action.triggerAction(listener, coin.getCurrentValue());
                }
            }
        }
    }
}
