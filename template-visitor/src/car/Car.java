package src.car;
import src.visitor.Visitor;

import java.util.ArrayList;

public class Car extends Part {
    private ArrayList<Part> parts = new ArrayList<Part>();

    public Car(int value) {
        super(value, true);
        this.parts.add(new Wheel(100, true));
        this.parts.add(new Wheel(100, true));
        this.parts.add(new Wheel(100, false));
        this.parts.add(new Wheel(100, true));
        this.parts.add(new Body(500, true));
        this.parts.add(new Engine(1000, false));
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCar(this);
    }

    @Override
    public boolean isWorking() {
        for (Part part : this.parts) {
            if (!part.isWorking()) {
                return false;
            }
        }
        return super.isWorking();
    }

    @Override
    public int getValue() {
        int value = super.getValue();
        for (Part part : this.parts) {
            value += part.getValue();
        }
        return value;
    }

    public ArrayList<Part> getParts() {
        return parts;
    }
}
