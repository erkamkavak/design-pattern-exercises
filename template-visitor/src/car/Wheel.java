package src.car;

import src.visitor.Visitor;

public class Wheel extends Part {
    public Wheel(int value, boolean isWorking) {
        super(value, isWorking);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitWheel(this);
    }
}
