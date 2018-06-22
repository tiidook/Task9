package by.rentalCars.exceptions;

public class AddingCarException extends AutoparkIsNorExistException{

    public AddingCarException(){
        super("Create autopark before add the car");
    }
}
