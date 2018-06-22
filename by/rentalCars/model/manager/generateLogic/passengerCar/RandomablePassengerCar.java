package by.rentalCars.model.manager.generateLogic.passengerCar;

import by.rentalCars.model.manager.generateLogic.Randomable;

public interface RandomablePassengerCar extends Randomable {

    public double generatePriceForKilometreI();
    public String generateName();
}
