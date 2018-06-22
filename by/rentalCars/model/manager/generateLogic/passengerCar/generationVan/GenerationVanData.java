package by.rentalCars.model.manager.generateLogic.passengerCar.generationVan;

import by.rentalCars.exceptions.AutoparkIsNorExistException;
import by.rentalCars.exceptions.LookingForIdExceprion;
import by.rentalCars.model.manager.generateLogic.passengerCar.RandomablePassengerCar;
import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.manager.util.Util;

import java.util.Random;

public class GenerationVanData implements RandomablePassengerCar {
    static Random random = new Random();

    public static final String[] NAMES = {"Caravelle", "Transporter 5", "Gazel", "Sprinter"
            , "Ram van", "Econoline", "Peugeot Boxer" ,"Grand Caravan", "Crafter"};

    public static final double MinPriceForKm = 0.6;
    public static final double MaxPriceForKM = 1.8;
    public static final int MaxPriceForCar = 50000;
    public static final int MinPriceForCar = 25000;

    @Override
    public double generatePriceForKilometreI() {
        return  (MinPriceForKm + (MaxPriceForKM - MinPriceForKm)
                * random.nextDouble());
    }

    @Override
    public String generateName() {
        return NAMES[random.nextInt(NAMES.length - 1 - 0 + 1) + 0];
    }

    @Override
    public int generateId(Autopark autopark) {
        int size = 0;
        try {
            size = Util.getAutoparkSize(autopark);
        } catch (AutoparkIsNorExistException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < size; i++){
            int id = random.nextInt(size + 2 - 1) + 1;

            try {
                if (!Util.checkListForId(autopark,id)){
                    return id;
                }
            } catch (LookingForIdExceprion lookingForIdExceprion) {
                lookingForIdExceprion.printStackTrace();
            }
        }
        return -1;
    }

    @Override
    public int generatePriceForCar() {
        return random.nextInt(MaxPriceForCar - MinPriceForCar + 1) + MinPriceForCar;
    }
}
