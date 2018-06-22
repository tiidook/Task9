package by.rentalCars.model.manager.util.instance;

import by.rentalCars.exceptions.AutoparkIsNorExistException;
import by.rentalCars.model.entity.Car;
import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.entity.truck.PickUp;
import by.rentalCars.model.manager.util.Util;

public class InstancePickUp {

    public static PickUp[] getPickUps(Autopark autopark) throws AutoparkIsNorExistException {

        if (Util.checkIsAutoparkExist(autopark)) {
            Car[] cars = autopark.getAutopark();
            int countPickUps = getCountPickUps(autopark);
            PickUp[] pickUps = null;

            if (countPickUps > 0) {
                pickUps = new PickUp[countPickUps];

                for (int i = 0; i < cars.length; i++) {

                    if (cars[i] instanceof PickUp) {
                        addPickUp(pickUps, (PickUp) cars[i]);
                    }
                }

            }
            return pickUps;
        } else {
            throw new AutoparkIsNorExistException();
        }
    }


    public static int getCountPickUps(Autopark autopark) {

        if (Util.checkIsAutoparkExist(autopark)) {
            Car[] cars = autopark.getAutopark();
            int countPickUps = 0;

            for (int i = 0; i < cars.length; i++) {
                if (((cars[i] instanceof PickUp))) {
                    countPickUps += 1;
                }
            }
            return countPickUps;
        }
        return 0;
    }


    public static void addPickUp(PickUp[] pickUps , PickUp pickUp){

        if (pickUps != null){

            for (int i = 0; i < pickUps.length; i++){

                if (pickUps[i] == null){
                    pickUps[i] = pickUp;
                    break;
                }
            }
        }
    }
}
