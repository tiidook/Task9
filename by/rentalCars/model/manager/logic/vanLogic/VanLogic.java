package by.rentalCars.model.manager.logic.vanLogic;

import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.manager.util.Util;
import by.rentalCars.model.manager.util.instance.InstanceVan;
import by.rentalCars.model.entity.passengerCar.Van;

public class VanLogic {

    public static Van getMaxBodyDistanceReserve(Autopark autopark){

        if (Util.checkIsAutoparkExist(autopark)) {
            Van[] vans = InstanceVan.getVans(autopark);

            Van van = new Van();
            van.setDistanceReserve(0);

            for (Van tempVans: vans) {

                if(tempVans.getDistanceReserve() > van.getDistanceReserve()){
                    van = tempVans;
                }
            }
            return van;
        }
        return null;
    }

    public static Van getMaxPriceForKmVan(Autopark autopark){

        if (Util.checkIsAutoparkExist(autopark)) {
            Van[] vans = InstanceVan.getVans(autopark);

            Van van = new Van();
            van.setPriceForKilometre(0);

            for (Van tempVan: vans) {

                if(tempVan.getPriceForKilometre() > van.getPriceForKilometre()){
                    van = tempVan;
                }
            }
            return van;
        }
        return null;
    }
}
