package by.rentalCars.model.entity.Container;

import by.rentalCars.model.entity.Car;

public class Autopark {

    private Car[] autopark;

    public void setAutopark(int countCars){
        autopark = new Car[countCars];
    }

    public Car[] getAutopark(){
        return autopark;
    }

    public void removeAutoPark(){
        autopark = null;
    }

}