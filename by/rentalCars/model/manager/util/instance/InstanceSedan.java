package by.rentalCars.model.manager.util.instance;

import by.rentalCars.model.entity.Car;
import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.entity.passengerCar.Sedan;
import by.rentalCars.model.manager.util.Util;

public class InstanceSedan {

    public static Sedan[] getSedans(Autopark autopark){

        if (Util.checkIsAutoparkExist(autopark)) {
            Car[] cars = autopark.getAutopark();
            int countSedans = getCountSedans(autopark);
            Sedan[] sedans = null;

            if (countSedans > 0) {
                sedans = new Sedan[countSedans];

                for (int i = 0; i < cars.length; i++){

                    if (cars[i] instanceof Sedan){
                        addSedan(sedans,(Sedan) cars[i]);
                    }
                }
            }
            return sedans;
        }
        return null;
    }


    public static int getCountSedans(Autopark autopark) {

        if (Util.checkIsAutoparkExist(autopark)) {
            Car[] cars = autopark.getAutopark();
            int countSedans = 0;

            for (int i = 0; i < cars.length; i++) {
                if (((cars[i] instanceof Sedan))) {
                    countSedans += 1;
                }
            }
            return countSedans;
        }
        return 0;
    }

    public static void addSedan(Sedan[] sedans , Sedan sedan){

        if (sedans != null){

            for (int i = 0; i < sedans.length; i++){

                if (sedans[i] == null){
                    sedans[i] = sedan;
                    break;
                }
            }
        }

    }
}
