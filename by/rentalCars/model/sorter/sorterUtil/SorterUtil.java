package by.rentalCars.model.sorter.sorterUtil;

import by.rentalCars.exceptions.AutoparkIsNorExistException;
import by.rentalCars.model.entity.Container.Autopark;

public class SorterUtil {

    public static int getMinIndex(Autopark autopark) throws AutoparkIsNorExistException {

        if (by.rentalCars.model.manager.util.Util.checkIsAutoparkExist(autopark)) {

            for (int i = 0; i < autopark.getAutopark().length; i++) {

                if (autopark.getAutopark()[i] != null) {
                    return i;
                }
            }
            return -1;
        } else {
            throw new AutoparkIsNorExistException();
        }
    }

    public static int getMaxIndex(Autopark autopark) throws AutoparkIsNorExistException {

        if (by.rentalCars.model.manager.util.Util.checkIsAutoparkExist(autopark)) {

            for (int i = autopark.getAutopark().length - 1; i > 0; i--) {

                if (autopark.getAutopark()[i] != null) {
                    return i;
                }
            }
            return -1;
        } else {
            throw new AutoparkIsNorExistException();
        }
    }
}
