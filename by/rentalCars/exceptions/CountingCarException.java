package by.rentalCars.exceptions;

public class CountingCarException extends AutoparkIsNorExistException {

    public CountingCarException(){
        super("create autopark before count cars");
    }
}
