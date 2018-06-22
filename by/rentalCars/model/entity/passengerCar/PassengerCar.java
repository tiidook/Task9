package by.rentalCars.model.entity.passengerCar;

import by.rentalCars.model.entity.Car;

public class PassengerCar extends Car {
    private double priceForKilometre;
    private String name;

    public PassengerCar(){

    }
    public PassengerCar(int id, int priceForCar, int priceForKilometre, String name ){
        super(id,priceForCar);

        this.priceForKilometre = priceForKilometre;
        this.name = name;
    }

    public double getPriceForKilometre() {
        return priceForKilometre;
    }

    public void setPriceForKilometre(double priceForKilometre) {
        this.priceForKilometre = priceForKilometre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
