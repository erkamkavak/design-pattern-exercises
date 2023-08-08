package src.coin;

public class CoinActionTrigger {
    public static final int ABOVE = 0;
    public static final int BELOW = 1;

    private int triggerValue;
    private int triggerType;

    public CoinActionTrigger(int triggerValue, int triggerType) {
        this.triggerValue = triggerValue;
        this.triggerType = triggerType;
    }

    public boolean checkTriggered(int currentValue) {
        if (triggerType == ABOVE) {
            return currentValue > triggerValue;
        } 
        else if(triggerType == BELOW) {
            return currentValue < triggerValue;
        }
        else{
            return false;
        }
    }

    public int getTriggerValue() {
        return triggerValue;
    }

    public int getTriggerType() {
        return triggerType;
    }
}
