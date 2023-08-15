package src.visitor;

import src.car.*;

public class Expertise implements Visitor {
    @Override
    public void visitCar(Car car) {  
        for (Part part : car.getParts()) {
            part.accept(this);
        }
        
        if (car.isWorking()) {
            System.out.println("Car is working");
        } else {
            System.out.println("Car is not working");
        }
    }

    @Override
    public void visitWheel(Wheel wheel) {
        if (wheel.isWorking()) {
            System.out.println("Wheel is working");
        } else {
            System.out.println("Wheel is not working");
        }
    }

    @Override
    public void visitEngine(Engine engine) {
        if (engine.isWorking()) {
            System.out.println("Engine is working");
        } else {
            System.out.println("Engine is not working");
        }
    }

    @Override
    public void visitBody(Body body) {
        if (body.isWorking()) {
            System.out.println("Body is working");
        } else {
            System.out.println("Body is not working");
        }
    }    
}
