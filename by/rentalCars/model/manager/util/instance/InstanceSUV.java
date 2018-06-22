package by.rentalCars.model.manager.util.instance;

import by.rentalCars.model.entity.Car;
import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.entity.truck.SUV;
import by.rentalCars.model.manager.util.Util;

public class InstanceSUV {

    public static SUV[] getSUVs(Autopark autopark){

        if (Util.checkIsAutoparkExist(autopark)) {
            Car[] cars = autopark.getAutopark();
            int countSuvs = getCountSUVs(autopark);
            SUV[] suvs = null;

            if (countSuvs > 0) {
                suvs = new SUV[countSuvs];

                for (int i = 0; i < cars.length; i++){

                    if (cars[i] instanceof SUV){
                        addSuv(suvs,(SUV) cars[i]);
                    }
                }

            }
            return suvs;
        }
        return null;
    }


    public static int getCountSUVs(Autopark autopark) {

        if (Util.checkIsAutoparkExist(autopark)) {
            Car[] cars = autopark.getAutopark();
            int countSUVs = 0;

            for (int i = 0; i < cars.length; i++) {
                if (((cars[i] instanceof SUV))) {
                    countSUVs += 1;
                }
            }
            return countSUVs;
        }
        return 0;
    }


    public static void addSuv(SUV[] suvs ,SUV suv){

        if (suvs != null){

            for (int i = 0; i < suvs.length; i++){

                if (suvs[i] == null){
                    suvs[i] = suv;
                    break;
                }
            }
        }

    }

}
