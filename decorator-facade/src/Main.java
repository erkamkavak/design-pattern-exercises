package src;

import src.car.*;

public class Main {
    public static Car createCar(boolean hasGlassCeiling, 
            boolean hasLeatherCoach, 
            boolean hasFoldingMirror) {
        Car car = new Car();
        if (hasGlassCeiling) {
            car = new GlassCeilingDecorator(car);
        }
        if (hasLeatherCoach) {
            car = new LeatherCoachDecorator(car);
        }
        if (hasFoldingMirror) {
            car = new FoldingMirrorDecorator(car);
        }
        return car;
    }

    public static void main(String[] args) {
        Car car = createCar(false, true, true);
        System.out.println(car.calculatePrice());
    }
}
