package src.car;

public class LeatherCoachDecorator extends Car {
    private Car wrappeeCar;

    public LeatherCoachDecorator(Car car) {
        this.wrappeeCar = car;
    }
        
    @Override
    public Integer calculatePrice() {
        int prevPrice = this.wrappeeCar.calculatePrice();
        int leatherCoachPrice = 30000;
        return prevPrice + leatherCoachPrice;
    }
}
