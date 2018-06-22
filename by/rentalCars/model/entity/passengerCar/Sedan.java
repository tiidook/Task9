package by.rentalCars.model.entity.passengerCar;

public class Sedan extends PassengerCar {
    private int power;
    private String driveUnit;
    private boolean isPetFriendly;

    public Sedan(){}

    public Sedan(int power, String driveUnit, boolean isPetFriendly) {
        this.power = power;
        this.driveUnit = driveUnit;
        this.isPetFriendly = isPetFriendly;
    }

    public Sedan(Sedan sedan){
        this.power = sedan.power;
        this.isPetFriendly = sedan.isPetFriendly;
        this.driveUnit = sedan.driveUnit;
    }

    public Sedan(int id, int priceForCar, int priceForKilometre, String name,
               int power, String driveUnit, boolean isPetFriendly){
        super(id,priceForCar,priceForKilometre,name);
        this.power = power;
        this.driveUnit = driveUnit;
        this.isPetFriendly = isPetFriendly;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDriveUnit() {
        return driveUnit;
    }

    public void setDriveUnit(String driveUnit) {
        this.driveUnit = driveUnit;
    }

    public boolean isPetFriendly() {
        return isPetFriendly;
    }

    public void setPetFriendly(boolean petFriendly) {
        isPetFriendly = petFriendly;
    }

    @Override
    public String toString(){
        return "\t id: " + super.getId() + "\t Price: " + super.getPriceForCar()
                + "\t Name: "
                + super.getName() + "\t Price for km: "
                + super.getPriceForKilometre()+ "\t Power: "
                + getPower()+ "\t Drive unit: "
                + getDriveUnit()+ "\t Is pet friendly: "
                + isPetFriendly();
    }
}
