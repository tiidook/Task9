package by.rentalCars.model.manager.generateLogic.truck.generationPuckUp;

import by.rentalCars.exceptions.AutoparkIsNorExistException;
import by.rentalCars.exceptions.LookingForIdExceprion;
import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.manager.generateLogic.truck.TruckGeneration;
import by.rentalCars.model.manager.util.Util;

import java.util.Random;

public class GenerationPickUpData extends TruckGeneration {

    static Random random = new Random();

    public static final String[] NAMES = {"Dodge Ram", "Ford f350", "GMC Sierra", "Toyota hillux"
            , "VolksWagen Amarok", "UAZ", "Chevrolet Avalanche" ,"Niva 3d", "Cryhsler Pacifica"};
    public static final int MinCountWheels = 4;
    public static final int MaxCountWheels = 8;
    public static final int MaxPriceForCar = 60000;
    public static final int MinPriceForCar = 45000;
    public static final double MaxCarryingCapacity = 2000.;
    public static final double MinCarryingCapacity = 500.;
    public static final int MinTankCapacity = 80;
    public static final int MaxTankCaracity = 150;
    public static final double MaxPriceForHour = 700.;
    public static final double MinPriceForHour = 400.;

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

    @Override
    public double generateCarryingCapacity() {
        return  (MinCarryingCapacity + (MaxCarryingCapacity - MinCarryingCapacity)
                * random.nextDouble());
    }

    @Override
    public int generateCountWheels() {
        return random.nextInt(MaxCountWheels - MinCountWheels + 1) + MinCountWheels;
    }

    @Override
    public int generateTankCapaCity() {
        return random.nextInt(MaxTankCaracity - MinTankCapacity + 1) + MinTankCapacity;
    }

    @Override
    public double generatePriceForHour() {
        return  (MinPriceForHour + (MaxPriceForHour - MinPriceForHour)
                * random.nextDouble());
    }

    @Override
    public String generateName() {
        return NAMES[random.nextInt(NAMES.length - 1 - 0 + 1) + 0];
    }
}
