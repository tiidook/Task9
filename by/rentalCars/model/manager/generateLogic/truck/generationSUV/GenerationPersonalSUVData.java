package by.rentalCars.model.manager.generateLogic.truck.generationSUV;

import java.util.Random;

public class GenerationPersonalSUVData {

    static Random random = new Random();

    public static final int MaxPower = 620;
    public static final int MinPower = 130;
    public static final int MaxWheelDiametre = 26;
    public static final int MinWheelDiametre = 16;

    public static int generatePower(){
        return random.nextInt(MaxPower - MinPower + 1) + MinPower;
    }

    public static int generateWheelDiametre(){
        return random.nextInt(MaxWheelDiametre - MinWheelDiametre + 1) + MinWheelDiametre;
    }
}
