package by.rentalCars.model.searcher;

import by.rentalCars.exceptions.AutoparkIsNorExistException;
import by.rentalCars.exceptions.LookingForIdExceprion;
import by.rentalCars.model.entity.Car;
import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.manager.util.Util;
import by.rentalCars.model.sorter.Sorter;
import by.rentalCars.model.sorter.sorterUtil.SorterUtil;

public class Searcher {

    public static Car findByIdLineSearch(Autopark autopark, int id) throws LookingForIdExceprion {

        if (Util.checkIsAutoparkExist(autopark)) {
            int lenght = autopark.getAutopark().length;

            for (int i = 0; i < lenght; i++) {

                if (autopark.getAutopark()[i].getId() == id) {
                    return autopark.getAutopark()[i];
                }
            }
            return null;
        } else {
            throw new LookingForIdExceprion();
        }
    }
    public static Car doSearch(Autopark autopark, int min, int max, int id) throws LookingForIdExceprion {

        if (Util.checkIsAutoparkExist(autopark)) {
            Car[] cars = autopark.getAutopark();
            int middle = (min + max) / 2;

            while ((cars[middle].getId() != id) && (min <= max)) {

                if (cars[middle].getId() > id) {
                    max = middle - 1;
                } else {
                    min = middle + 1;
                }
                middle = (min + max) / 2;
            }

            if (min <= max) {
                return cars[middle];
            } else {
                return null;

            }

        } else {
            throw new LookingForIdExceprion();
        }
    }

    public static final Car findByIdBinary(Autopark autopark,int id){
        int min = -1;
        int max = -1;

        try {
            Sorter.getSelectionSort(autopark);
        } catch (AutoparkIsNorExistException e) {
            e.printStackTrace();
        }

        try {
            min = SorterUtil.getMinIndex(autopark);
            max = SorterUtil.getMaxIndex(autopark);
        } catch (AutoparkIsNorExistException e) {
            e.printStackTrace();
        }

        try {
            return doSearch(autopark,min,max,id);
        } catch (LookingForIdExceprion lookingForIdExceprion) {
            lookingForIdExceprion.printStackTrace();
        }
        return null;
    }
}
