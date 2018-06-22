package by.rentalCars.model.entity;

public class Car{
    private int id;
    private int priceForCar;

    public Car(){

    }

    public Car(int id, int priceForCar){
        this.id = id;
        this.priceForCar = priceForCar;
    }
    public Car(Car car){
        this.priceForCar = car.priceForCar;
        this.id = car.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriceForCar() {
        return priceForCar;
    }

    public void setPriceForCar(int priceForCar) {
        this.priceForCar = priceForCar;
    }

}
