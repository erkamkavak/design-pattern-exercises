package src.car;

public class GlassCeilingDecorator extends Car {
    private Car wrappeeCar;
    
    public GlassCeilingDecorator(Car car) {
        this.wrappeeCar = car;
    }
    
    @Override
    public Integer calculatePrice() {
        int prevPrice = this.wrappeeCar.calculatePrice();
        int glassCeilingPrice = 50000;
        return prevPrice + glassCeilingPrice;
    }
}
