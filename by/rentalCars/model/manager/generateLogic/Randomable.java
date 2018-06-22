package by.rentalCars.model.manager.generateLogic;

import by.rentalCars.model.entity.Container.Autopark;

public interface Randomable {

    public int generateId(Autopark autopark);
    public int generatePriceForCar();
}
