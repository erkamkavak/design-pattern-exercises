package src.visitor;

import src.car.*; 

public interface Visitor {
    public void visitCar(Car car);
    public void visitWheel(Wheel wheel);
    public void visitEngine(Engine engine);
    public void visitBody(Body body);
}
