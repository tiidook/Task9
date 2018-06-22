package by.rentalCars.model.manager.generateLogic.truck;

import by.rentalCars.model.entity.Container.Autopark;

public abstract class TruckGeneration implements RandomableTruck {

    @Override
    public abstract int generateId(Autopark autopark);

    @Override
    public abstract int generatePriceForCar();

    @Override
    public abstract double generateCarryingCapacity();

    @Override
    public abstract int generateCountWheels();

    @Override
    public abstract int generateTankCapaCity();

    @Override
    public abstract double generatePriceForHour();

    @Override
    public abstract String generateName();
}
