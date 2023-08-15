package src.car;

import src.visitor.Visitor;

public class Engine extends Part {
    public Engine(int value, boolean isWorking) {
        super(value, isWorking);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitEngine(this);
    }
}
