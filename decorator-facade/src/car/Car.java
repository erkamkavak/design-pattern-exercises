package src.car;

public class Car {
    private Integer weight;
    private Integer numOfTyres;
    private Integer numOfDoors;
    private String model; 

    public Car() {
    }

    public Integer calculatePrice() {
        int defaultPrice = 100000; 
        return defaultPrice;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getNumOfTyres() {
        return numOfTyres;
    }

    public Integer getNumOfDoors() {
        return numOfDoors;
    }

    public String getModel() {
        return model;
    }
}
