package by.rentalCars.model.entity.truck;

public class PickUp extends Truck {

    private double bodyVolume;
    private double torque;
    private boolean removableRoof;

    public PickUp(){
    }

    public PickUp(PickUp pickUp){
        this.removableRoof = pickUp.removableRoof;
        this.bodyVolume = pickUp.bodyVolume;
        this.torque = pickUp.torque;
    }

    public PickUp(double bodyVolume, double torque, boolean removableRoof) {
        this.bodyVolume = bodyVolume;
        this.torque = torque;
        this.removableRoof = removableRoof;
    }

    public PickUp(int id, int priceForCar, double carryingCapacity, int countCars, int tankCapacity,
                  double priceForHour, String name, double bodyVolume, double torque, boolean removableRoof){
        super(id,priceForCar,carryingCapacity,countCars,tankCapacity,priceForHour,name);

        this.bodyVolume = bodyVolume;
        this.torque = torque;
        this.removableRoof = removableRoof;
    }

    public double getBodyVolume() {
        return bodyVolume;
    }

    public void setBodyVolume(double bodyVolume) {
        this.bodyVolume = bodyVolume;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public boolean isRemovableRoof() {
        return removableRoof;
    }

    public void setRemovableRoof(boolean removableRoof) {
        this.removableRoof = removableRoof;
    }

    @Override
    public String toString(){
        return "\t id: " + super.getId() + "\t Price: " + super.getPriceForCar()
                + "\t Name: "
                + super.getName()+ "\t CarryingCapacity: "
                + super.getCarryingCapacity()+ "\t Count of of wheels: "
                + super.getCountOfWheels() + "\t CarryingCapacity: "
                + super.getCarryingCapacity()+ "\t Tank capacity: "
                + super.getTankCapacity()+ "\t Price for Hour: "
                + super.getPriceForHour()
                + "\t Body volume: "
                + getBodyVolume()
                + "\t Torque: "
                + getTorque()
                + "\t Removable roof: "
                + isRemovableRoof();
    }
}
