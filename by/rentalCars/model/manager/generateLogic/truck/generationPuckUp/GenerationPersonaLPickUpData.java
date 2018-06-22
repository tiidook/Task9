package by.rentalCars.model.manager.generateLogic.truck.generationPuckUp;

import java.util.Random;

public class GenerationPersonaLPickUpData {

    private double bodyVolume;
    private double torque;
    private boolean removableRoof;
    public static final double MaxVolume = 10.;
    public static final double MinVolume = 4.;
    public static final double MaxTorque = 900.;
    public static final double MinTorque = 450.;


    static Random random = new Random();

    public static double generareBodVolume(){
        return  (MinVolume + (MaxVolume - MinVolume)
                * random.nextDouble());
    }

    public static double generateTorque(){
        return  (MinTorque + (MaxTorque - MinTorque)
                * random.nextDouble());
    }

    public static boolean generateRemovableRoof(){
        return random.nextBoolean();
    }

}
