package by.rentalCars.model.manager.generateLogic.passengerCar.generationSedan;

import java.util.Random;

public class GenerationPersonalSedanData {

    public static final String[] UNITS = {"AWD", "4WD", "4X4", "Mono"};

    public static final int MaxPower = 430;
    public static final int MinPower = 90;
    static Random random = new Random();

    public static int generatePower(){
        return random.nextInt(MaxPower - MinPower + 1) + MinPower;
    }

    public static String generateDriveUnit(){
        return UNITS[random.nextInt(UNITS.length - 1 - 0 + 1) + 0];
    }

    public static boolean generateIsPetFriendly(){
        return random.nextBoolean();
    }

}
