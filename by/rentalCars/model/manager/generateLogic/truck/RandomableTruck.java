package by.rentalCars.model.manager.generateLogic.truck;

import by.rentalCars.model.manager.generateLogic.Randomable;

public interface RandomableTruck extends Randomable {

    public double generateCarryingCapacity();
    public int generateCountWheels();
    public int generateTankCapaCity();
    public double generatePriceForHour();
    public String generateName();
}
