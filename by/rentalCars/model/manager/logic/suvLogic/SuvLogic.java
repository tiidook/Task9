package by.rentalCars.model.manager.logic.suvLogic;

import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.entity.truck.SUV;
import by.rentalCars.model.manager.util.Util;
import by.rentalCars.model.manager.util.instance.InstanceSUV;

public class SuvLogic {

    public static SUV getMaxWheelDiametre(Autopark autopark){

        if (Util.checkIsAutoparkExist(autopark)) {
            SUV[] suvs = InstanceSUV.getSUVs(autopark);

            SUV suv = new SUV();
            suv.setWheelDiameter(0);

            for (SUV tempSUV: suvs) {

                if(tempSUV.getWheelDiameter() > suv.getWheelDiameter()){
                    suv = tempSUV;
                }
            }
            return suv;
        }
        return null;
    }

    public static SUV getMaxTankCapacitySUV(Autopark autopark){

        if (Util.checkIsAutoparkExist(autopark)) {
            SUV[] suvs = InstanceSUV.getSUVs(autopark);

            SUV suv = new SUV();
            suv.setTankCapacity(0);

            for (SUV tempSuv: suvs) {

                if(tempSuv.getTankCapacity() > suv.getTankCapacity()){
                    suv = tempSuv;
                }
            }
            return suv;
        }
        return null;
    }

}
