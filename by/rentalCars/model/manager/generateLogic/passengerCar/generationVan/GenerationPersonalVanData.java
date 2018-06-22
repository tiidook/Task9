package by.rentalCars.model.manager.generateLogic.passengerCar.generationVan;

import java.util.Random;

public class GenerationPersonalVanData {

    static Random random = new Random();

    public static final int MinCountSeats = 5;
    public static final int MaxCountSeats = 14;
    public static final int MaxDistanceReserve = 1100;
    public static final int MinDistanceReserve = 600;

    public static int generateCountSeats(){
        return random.nextInt(MaxCountSeats - MinCountSeats + 1) + MinCountSeats;
    }

    public static boolean generateTrunkExist(){
        return random.nextBoolean();
    }

    public static int generateDistanceReserve(){
        return random.nextInt(MaxDistanceReserve - MinDistanceReserve + 1) + MaxDistanceReserve;
    }


}
