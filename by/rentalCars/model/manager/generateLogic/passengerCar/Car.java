package by.rentalCars.model.manager.generateLogic.passengerCar;

import by.rentalCars.model.entity.Container.Autopark;

public abstract class Car implements RandomablePassengerCar{

    @Override
    public abstract int generateId(Autopark autopark);

    @Override
    public abstract int generatePriceForCar();

    @Override
    public abstract double generatePriceForKilometreI();

    @Override
    public abstract String generateName();

}
