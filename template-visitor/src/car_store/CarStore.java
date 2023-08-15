package src.car_store;

import src.car.*;
import src.visitor.*;

public abstract class CarStore {
    protected Expertise expertise;
    protected CarAppraiser carAppraiser;

    public CarStore(){
        this.expertise = new Expertise();
        this.carAppraiser = new CarAppraiser();
    }

    public void acceptExpertise(Car car) {
        car.accept(this.expertise);
    }

    public void acceptAppraiser(Car car) {
        car.accept(this.carAppraiser);
    }

    public abstract void repair(Car car);
    public abstract void lights(Car car);
    public abstract void ride(Car car);
    public abstract void sell(Car car);

    public void processCar(Car car) {
        this.acceptExpertise(car);
        this.repair(car); 
        this.acceptAppraiser(car); 
        this.lights(car); 
        this.ride(car); 
        this.sell(car); 
    }
}
