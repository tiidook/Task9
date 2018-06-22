package by.rentalCars.model.manager.logic.generalDataLogic;

import by.rentalCars.exceptions.AutoparkIsNorExistException;
import by.rentalCars.model.entity.Car;
import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.manager.util.Util;

public class Logic {

    public static Car getMostExpensiveCar(Autopark autopark) throws AutoparkIsNorExistException {

        if (Util.checkIsAutoparkExist(autopark)){
            Car[] cars = autopark.getAutopark();
            Car mostExpensive = null;
            int minPrice = 0;
            for (Car car: cars) {
                if (car != null && (car.getPriceForCar() > minPrice)){
                    mostExpensive = car;
                }
            }
            return mostExpensive;
        } else {
            throw new AutoparkIsNorExistException();
        }
    }

    public static Car getCheapestCar(Autopark autopark) throws AutoparkIsNorExistException {

        if (Util.checkIsAutoparkExist(autopark)){
            Car[] cars = autopark.getAutopark();
            Car cheapestCar = null;

            for (Car car: cars) {
                if (car != null){
                    cheapestCar = car;
                    break;
                }
            }

            for (Car car: cars) {
                if (car != null && (car.getPriceForCar() < cheapestCar.getPriceForCar())){
                    cheapestCar = car;
                }
            }
            return cheapestCar;
        }
        else {
            throw new AutoparkIsNorExistException();
        }
    }

    public static int getGeneralPrice(Autopark autopark) throws AutoparkIsNorExistException {

        if (Util.checkIsAutoparkExist(autopark)){
            int generalPrice = 0;
            Car[] cars = autopark.getAutopark();

            for (Car car: cars) {

                if (car != null){
                    generalPrice += car.getPriceForCar();
                }
            }
            return generalPrice;
        }
        else {
            throw new AutoparkIsNorExistException();
        }
    }

}
