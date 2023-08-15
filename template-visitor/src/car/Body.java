package src.car;

import src.visitor.Visitor;

public class Body extends Part {
    public Body(int value, boolean isWorking) {
        super(value, isWorking);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBody(this);
    }
}
