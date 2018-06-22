package by.rentalCars.model.manager.util.instance;

import by.rentalCars.model.entity.Car;
import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.entity.passengerCar.Van;
import by.rentalCars.model.manager.util.Util;

public class InstanceVan {

    public static Van[] getVans(Autopark autopark){

        if (Util.checkIsAutoparkExist(autopark)) {
            Car[] cars = autopark.getAutopark();
            int countVans = getCountVans(autopark);
            Van[] vans = null;

            if (countVans > 0) {
                vans = new Van[countVans];

                for (int i = 0; i < cars.length; i++){

                    if (cars[i] instanceof Van){
                        addVan(vans,(Van)cars[i]);
                    }
                }

            }
            return vans;
        }
        return null;
    }


    public static int getCountVans(Autopark autopark) {

        if (Util.checkIsAutoparkExist(autopark)) {
            Car[] cars = autopark.getAutopark();
            int countVans = 0;

            for (int i = 0; i < cars.length; i++) {
                if (((cars[i] instanceof Van))) {
                    countVans += 1;
                }
            }
            return countVans;
        }
        return 0;
    }


    public static void addVan(Van[] vans ,Van van){

        if (vans != null){

            for (int i = 0; i < vans.length; i++){

                if (vans[i] == null){
                    vans[i] = van;
                    break;
                }
            }
        }

    }
}
