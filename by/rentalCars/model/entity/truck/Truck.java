package by.rentalCars.model.entity.truck;

import by.rentalCars.model.entity.Car;

public class Truck extends Car {
    private double carryingCapacity;
    private int countOfWheels;
    private int tankCapacity;
    private double priceForHour;
    private String name;


    public Truck(){

    }

    public Truck(int id, int priceForCar, double carryingCapacity, int countOfWheels, int tankCapacity,
                 double priceForHour, String name){
        super(id,priceForCar);

        this.carryingCapacity = carryingCapacity;
        this.countOfWheels = countOfWheels;
        this.tankCapacity = tankCapacity;
        this.priceForHour = priceForHour;
        this.name = name;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
    public double getPriceForHour() {
        return priceForHour;
    }

    public void setPriceForHour(double priceForHour) {
        this.priceForHour = priceForHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
