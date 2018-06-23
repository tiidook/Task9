package by.rentalCars.model.sorter;

import by.rentalCars.exceptions.AutoparkIsNorExistException;
import by.rentalCars.model.entity.Car;
import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.manager.util.Util;
import by.rentalCars.model.sorter.sorterUtil.SorterUtil;

import static by.rentalCars.model.sorter.sorterUtil.SorterUtil.getMaxIndex;

public class Sorter {

    public static void getBubbleSort(Autopark autopark) throws AutoparkIsNorExistException {

        if (Util.checkIsAutoparkExist(autopark)){
            Car[] tempArr = autopark.getAutopark();
            Car car;

            for (int i = 0; i < tempArr.length; i++)
                for (int j = i + 1; j < tempArr.length; j++){
                if ((tempArr[i] != null && tempArr[j] != null)
                        && tempArr[j].getId() > tempArr[i].getId()){

                    car = tempArr[i];
                    tempArr[i] = tempArr[j];
                    tempArr[j] = car;
                }
            }
         autopark.setData(tempArr);
        } else {
            throw new AutoparkIsNorExistException();
        }
    }

    public static void getInsertSort(Autopark autopark) throws AutoparkIsNorExistException {

        if (Util.checkIsAutoparkExist(autopark)){
            Car[] tempArr = autopark.getAutopark();
            Car car;
            for (int i = 1; i < tempArr.length; i++)
                for (int j = i; j > 0; j--){

                if (tempArr[j -1] != null
                        && tempArr[j] != null
                        && tempArr[j - 1].getId() > tempArr[j].getId()) {

                    car = tempArr[j - 1];
                    tempArr[j - 1] = tempArr[j];
                    tempArr[j] = car;

                }
            }
            autopark.setData(tempArr);
        } else {
            throw new AutoparkIsNorExistException();
        }
    }


    public static void getSelectionSort(Autopark autopark) throws AutoparkIsNorExistException {

        if(Util.checkIsAutoparkExist(autopark)){
            Car[] tempArr = autopark.getAutopark();
            Car car;

            if (tempArr[0] == null){
                return;
            }

            for (int i = 0; i < tempArr.length; i++){
                int minIdIndex = i;

                for (int j = i + 1; j < tempArr.length; j++){

                    if (tempArr[j] != null && tempArr[minIdIndex] != null && tempArr[j].getId()
                            < tempArr[minIdIndex].getId()){
                        minIdIndex = j;
                    }
                }
                car = tempArr[i];
                tempArr[i] = tempArr[minIdIndex];
                tempArr[minIdIndex] = car;
            }
            autopark.setData(tempArr);
        } else {
            throw new AutoparkIsNorExistException();
        }
    }


    public static void sort(Car[] cars, int min, int max){

        if (cars.length == 0){
            return;
        }

        if(min > max){
            return;
        }

        int middle = min + (max - min) / 2;
        Car carNode = cars[middle];

        int i = min;
        int j = max;

        while (i < j){
            while (cars[i].getId() < carNode.getId()){
                i++;
            }
            while (cars[j].getId() > carNode.getId()){
                j--;
            }

            if (i <= j){
                Car car = cars[i];
                cars[i] = cars[j];
                cars[j] = car;
                i++;
                j--;
            }
        }

        if (min < j){
            sort(cars, min, j);
        }

        if (max > i){
            sort(cars, i, max);
        }
    }

    public static void getQuickSort(Autopark autopark){
        int min = -1;
        int max = -1;

        try {
            min = SorterUtil.getMinIndex(autopark);
            max = SorterUtil.getMaxIndex(autopark);
        } catch (AutoparkIsNorExistException e) {
            e.printStackTrace();
        }

        Car[] cars = autopark.getAutopark();

        if (min >= 0 && max >= 0) {
            sort(cars, min, max);
        }
        autopark.setData(cars);
    }
}
