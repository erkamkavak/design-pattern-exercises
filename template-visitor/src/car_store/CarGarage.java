package src.car_store;

import src.car.*;

public class CarGarage extends CarStore {
    @Override
    public void repair(Car car) {
        for (Part part : car.getParts()) {
            if (!part.isWorking()) {
                part.setWorking(true);
                System.out.println("Repaired " + part.getClass().getName());
            }
        }
        car.setWorking(true);
    }

    @Override
    public void lights(Car car) {
        // garage does not have lights function
    }

    @Override
    public void ride(Car car) {
        // garage does not have ride function        
    }

    @Override
    public void sell(Car car) {
        // garage does not have sell function
    }    
}
