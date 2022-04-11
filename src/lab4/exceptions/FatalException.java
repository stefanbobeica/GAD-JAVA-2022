package lab4.exceptions;

public class FatalException extends RuntimeException{
    public FatalException(){
        super("There is no way from here");
    }
}
