package lab4.exceptions;

public class WrongInputException extends Exception{
    public WrongInputException(int i){
        super("The innput value is not suported." + i);
    }
}
