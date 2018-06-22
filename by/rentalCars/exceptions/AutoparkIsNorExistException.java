package by.rentalCars.exceptions;

public class AutoparkIsNorExistException extends Exception{

    public AutoparkIsNorExistException(String message){
        super(message);
    }
    public AutoparkIsNorExistException(){
        super(" Must create autopark ");
    }
}
