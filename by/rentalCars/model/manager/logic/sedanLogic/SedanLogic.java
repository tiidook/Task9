package by.rentalCars.model.manager.logic.sedanLogic;

import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.entity.passengerCar.Sedan;
import by.rentalCars.model.manager.util.Util;
import by.rentalCars.model.manager.util.instance.InstanceSedan;

public class SedanLogic {


    public static Sedan getMostPowerfulSedan(Autopark autopark){

        if (Util.checkIsAutoparkExist(autopark)) {
            Sedan[] sedans = InstanceSedan.getSedans(autopark);

            Sedan sedan = new Sedan();
            sedan.setPower(0);

            for (Sedan tempSedan: sedans) {

                if(tempSedan.getPower() > sedan.getPower()){
                    sedan = tempSedan;
                }
            }
            return sedan;
        }
        return null;
    }

    public static Sedan getMaxPriceForKmSedan(Autopark autopark){

        if (Util.checkIsAutoparkExist(autopark)) {
            Sedan[] sedans = InstanceSedan.getSedans(autopark);

            Sedan sedan = new Sedan();
            sedan.setPriceForKilometre(0);

            for (Sedan tempSedan: sedans) {

                if(tempSedan.getPriceForKilometre() > sedan.getPriceForKilometre()){
                    sedan = tempSedan;
                }
            }
            return sedan;
        }
        return null;
    }
}
