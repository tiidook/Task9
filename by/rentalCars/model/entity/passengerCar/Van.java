package by.rentalCars.model.entity.passengerCar;

public class Van extends PassengerCar {
    private int countSeats;
    private boolean trunk;
    private int distanceReserve;

    public Van(){}

    public Van(int countSeats, boolean trunk, int distanceReserve) {
        this.countSeats = countSeats;
        this.trunk = trunk;
        this.distanceReserve = distanceReserve;
    }

    public Van(Van van){
        this.distanceReserve = van.distanceReserve;
        this.trunk = van.trunk;
        this.countSeats = van.countSeats;
    }

    public Van(int id, int priceForCar, int priceForKilometre, String name,
               int countSeats,boolean trunk, int distanceReserve){
        super(id,priceForCar,priceForKilometre,name);
        this.countSeats = countSeats;
        this.trunk = trunk;
        this.distanceReserve = distanceReserve;
    }

    public int getCountSeats() {
        return countSeats;
    }


    public void setCountSeats(int countSeats) {
        this.countSeats = countSeats;
    }

    public boolean isTrunk() {
        return trunk;
    }

    public void setTrunk(boolean trunk) {
        this.trunk = trunk;
    }

    public int getDistanceReserve() {
        return distanceReserve;
    }

    public void setDistanceReserve(int distanceReserve) {
        this.distanceReserve = distanceReserve;
    }

    @Override
    public String toString(){
        return "\t id: " + super.getId() + "\t Price: " + super.getPriceForCar()+ "\t Name: "
                + super.getName() + "\t Price for km: "
                + super.getPriceForKilometre() + "\t Count seats: "
                + getCountSeats()+ "\t Trunk: "
                + isTrunk()+ "\t Distance Reserve: "
                + getDistanceReserve();
    }
}
