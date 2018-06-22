package by.rentalCars.model.manager.logic.pickUpLogic;

import by.rentalCars.exceptions.AutoparkIsNorExistException;
import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.entity.truck.PickUp;
import by.rentalCars.model.manager.util.Util;
import by.rentalCars.model.manager.util.instance.InstancePickUp;

public class PickUpLogic {

    public static PickUp getMaxBodyVolume(Autopark autopark) throws AutoparkIsNorExistException {

        if (Util.checkIsAutoparkExist(autopark)) {
            PickUp[] pickUps = InstancePickUp.getPickUps(autopark);

            PickUp pickUp = new PickUp();
            pickUp.setBodyVolume(0);

            if (pickUps != null) {

                for (PickUp tempPickUp : pickUps) {

                    if (tempPickUp.getBodyVolume() > pickUp.getBodyVolume()) {
                        pickUp = tempPickUp;
                    }
                }
            } else {
                return null;
            }
            return pickUp;
        } else {
            throw new AutoparkIsNorExistException();
        }
    }

    public static PickUp getMaxPriceForHourPickUp(Autopark autopark) throws AutoparkIsNorExistException {

        if (Util.checkIsAutoparkExist(autopark)) {
            PickUp[] pickUps = InstancePickUp.getPickUps(autopark);

            PickUp pickUp = new PickUp();
            pickUp.setPriceForHour(0);

            if (pickUps != null) {

                for (PickUp tempPickUp : pickUps) {

                    if (tempPickUp.getPriceForHour() > pickUp.getPriceForHour()) {
                        pickUp = tempPickUp;
                    }
                }

            } else {
                return null;
            }
            return pickUp;
        } else {
            throw new AutoparkIsNorExistException();
        }
    }

}
