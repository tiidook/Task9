package by.rentalCars.model.manager.util;

import by.rentalCars.exceptions.*;
import by.rentalCars.model.entity.Car;
import by.rentalCars.model.entity.Container.Autopark;

public class Util {

    public static void createAutopark(Autopark autopark,int countCars){

        if (!checkIsAutoparkExist(autopark)) {

            if (countCars > 0) {
                autopark.setAutopark(countCars);
            }
        }
    }

    public static Car[] getAll(Autopark autopark) {

        return  checkIsAutoparkExist(autopark) ? autopark.getAutopark() : null;
    }

    public static boolean checkIsAutoparkExist(Autopark autopark){

        return  autopark.getAutopark() != null;
    }

    public static void addCar(Autopark autopark, Car car) throws AutoparkIsNorExistException{

        if (checkIsAutoparkExist(autopark)){
            int lenght = autopark.getAutopark().length;

            for (int i = 0; i < lenght; i++){

                if (autopark.getAutopark()[i] == null){
                    autopark.getAutopark()[i] = car;

                    break;
                }
            }
        } else {
            throw new AddingCarException();
        }
    }

    public static void removeById(Autopark autopark, int id) throws AutoparkIsNorExistException{

        if (checkIsAutoparkExist(autopark)){
            int lenght = autopark.getAutopark().length;

            for (int i = 0; i < lenght; i++){

                if (autopark.getAutopark()[i].getId() == id){
                    autopark.getAutopark()[i] = null;
                    break;
                }
            }
        } else {
            throw new RemovingCarExceprion();
        }
    }

    public static int getCountCars(Autopark autopark) throws CountingCarException {

        if (checkIsAutoparkExist(autopark)){
            int count = 0;
            int lenght = autopark.getAutopark().length;

            for (int i = 0; i < lenght; i++){

                if (autopark.getAutopark()[i] != null){
                    count++;
                }
            }
            return count;
        } else {
            throw new CountingCarException();
        }
    }

    public static int getAutoparkSize(Autopark autopark) throws AutoparkIsNorExistException {

        if (checkIsAutoparkExist(autopark)){
            return autopark.getAutopark().length;
        } else{
            throw new AutoparkIsNorExistException();
        }

    }

    public static Car findById(Autopark autopark, int id) throws LookingForIdExceprion {

        if(checkIsAutoparkExist(autopark)){
            int lenght = autopark.getAutopark().length;

            for (int i = 0; i < lenght; i++){

                if (autopark.getAutopark()[i].getId() == id){
                    return autopark.getAutopark()[i];
                }
            }
            return null;
        } else {
            throw new LookingForIdExceprion();
        }
    }

    public static void removeAutopark(Autopark autopark) throws LookingForIdExceprion {

        if (checkIsAutoparkExist(autopark)){
            autopark.removeAutoPark();
        } else {
            throw new LookingForIdExceprion();
        }
    }

    public static boolean checkListForId(Autopark autopark, int id) throws LookingForIdExceprion {

        if (checkIsAutoparkExist(autopark)) {

            for (int i = 0; i < autopark.getAutopark().length; i++) {

                if (autopark.getAutopark()[i] != null && autopark.getAutopark()[i].getId() == id) {
                    return true;
                }
            }
            return false;
        }else {
            throw new LookingForIdExceprion();
        }
    }

}
