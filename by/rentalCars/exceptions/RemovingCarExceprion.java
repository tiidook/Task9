package by.rentalCars.exceptions;

public class RemovingCarExceprion extends AutoparkIsNorExistException {

    public RemovingCarExceprion(){
        super("Create autopark before remove car");
    }
}
