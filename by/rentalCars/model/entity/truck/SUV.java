package by.rentalCars.model.entity.truck;

public class SUV extends Truck {

    private int power;
    private int wheelDiameter;

    public SUV(){}

    public SUV(int power, int wheelDiameter) {
        this.power = power;
        this.wheelDiameter = wheelDiameter;
    }

    public SUV(SUV suv){
        this.power = suv.power;
        this.wheelDiameter = suv.wheelDiameter;
    }

    public SUV(int id, int priceForCar, double carryingCapacity, int countCars, int tankCapacity,
               double priceForHour, String name, int power, int wheelDiameter){
        super(id,priceForCar,carryingCapacity,countCars,tankCapacity,priceForHour,name);

        this.power = power;
        this.wheelDiameter = wheelDiameter;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    @Override
    public String toString(){
        return "\t id: " + super.getId() + "\t Price: "
                + super.getPriceForCar()+ "\t Name: "
                + super.getName() + "\t CarryingCapacity: "
                + super.getCarryingCapacity()+ "\t Count of of wheels: "
                + super.getCountOfWheels() + "\t CarryingCapacity: "
                + super.getCarryingCapacity()+ "\t Tank capacity: "
                + super.getTankCapacity()+ "\t Price for Hour: "
                + super.getPriceForHour()
                + "\t Power: "
                + getPower()
                + "\t Wheel Diametre: "
                + getWheelDiameter();
    }
}
