package src.car;

import src.visitor.Visitor;

public abstract class Part {
    private boolean isWorking;
    private int value; 

    public Part(int value, boolean isWorking) {
        this.value = value;
        this.isWorking = isWorking;
    }

    public abstract void accept(Visitor visitor);

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public int getValue() {
        if (isWorking) {
            return value;
        }
        return 0;
    }
}
