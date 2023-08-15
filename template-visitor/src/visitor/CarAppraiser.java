package src.visitor;

import src.car.*;

public class CarAppraiser implements Visitor {
    @Override
    public void visitCar(Car car) {
        for (Part part : car.getParts()) {
            part.accept(this);
        }
        
        if (car.isWorking()) {
            System.out.println("Car's value is: " + car.getValue());
        } else {
            System.out.println("Car is broken, car's value is: " + car.getValue());
        }
    }

    @Override
    public void visitWheel(Wheel wheel) {
        if (wheel.isWorking()) {
            System.out.println("Wheel's value is: " + wheel.getValue());
        } else {
            System.out.println("Wheel is broken");
        }
    }

    @Override
    public void visitEngine(Engine engine) {
        if (engine.isWorking()) {
            System.out.println("Engine's value is: " + engine.getValue());
        } else {
            System.out.println("Engine is broken");
        }
    }

    @Override
    public void visitBody(Body body) {
        if (body.isWorking()) {
            System.out.println("Body's value is: " + body.getValue());
        } else {
            System.out.println("Body is broken");
        }
    }    
}
