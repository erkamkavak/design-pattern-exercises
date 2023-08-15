package src;

import src.car.*;
import src.car_store.*;
import src.visitor.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(15000);
        Expertise expertise = new Expertise();
        CarAppraiser carAppraiser = new CarAppraiser();

        car.accept(expertise);
        car.accept(carAppraiser);

        CarGallery carGallery = new CarGallery();
        carGallery.processCar(car);
        
        CarGarage carGarage = new CarGarage();
        carGarage.processCar(car);
    }
}
