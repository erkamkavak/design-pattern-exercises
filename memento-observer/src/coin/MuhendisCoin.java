package src.coin;

import src.manager.*;

public class MuhendisCoin {
    private int currentValue; 
    private int[] valuesForDays;
    private int currentDay;

    public MuhendisCoin(int[] valuesForDays) {
        this.currentValue = valuesForDays[0];
        this.valuesForDays = valuesForDays;
        this.currentDay = 0;
    }

    public void nextDay() {
        currentDay++;
        if (currentDay >= valuesForDays.length) {
            System.out.println("Coin value is not updated for day: " + currentDay);
            return;
        }
        this.setCurrentValue(valuesForDays[currentDay]);
    }

    public void passDays(int dayCount) {
        for (int i = 0; i < dayCount; i++) {
            nextDay();
        }
    }

    public void passDaysUntilEnd() {
        passDays(valuesForDays.length - currentDay - 1);
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int value) {
        this.currentValue = value;
        MuhendisCoinManager.getInstance().notifyListeners(this);
    }
}
