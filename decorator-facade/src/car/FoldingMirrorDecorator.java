package src.car;

public class FoldingMirrorDecorator extends Car {
    private Car wrappeeCar;

    public FoldingMirrorDecorator(Car car) {
        this.wrappeeCar = car;
    }

    @Override
    public Integer calculatePrice() {
        int prevPrice = this.wrappeeCar.calculatePrice();
        int foldingMirrorPrice = 10000;
        return prevPrice + foldingMirrorPrice;
    }
}
