package src.coin;

import src.manager.*;

public class CoinAction {
    private CoinActionTrigger actionTrigger;
    private CoinActionEvent actionEvent;

    public CoinAction(CoinActionTrigger actionTrigger, CoinActionEvent actionEvent) {
        this.actionTrigger = actionTrigger;
        this.actionEvent = actionEvent;
    }

    public boolean checkActionTriggered(int currentValue) {
        return actionTrigger.checkTriggered(currentValue);
    }

    public void triggerAction(Trader trader, int currentCoinValue) {
        actionEvent.triggerAction(trader, currentCoinValue);
    }
}
