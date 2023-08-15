package src.car_store;

import src.car.Car;

public class CarGallery extends CarStore {
    @Override
    public void repair(Car car) {
        // gallery does not repair
    }

    @Override
    public void lights(Car car) {
        System.out.println("Lights are on");
    }

    @Override
    public void ride(Car car) {
        System.out.println("Ready to ride");
    }

    @Override
    public void sell(Car car) {
        System.out.println("Car is sold");
    }
}
