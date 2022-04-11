package lab4.exceptions;

public class Calculator   {
    private int intermediateOperation(int i)throws WrongInputException{
        if ( i % 2 ==0)
            throw new WrongInputException(i);
        return i =3 ;
    }
    public int calculateResult( int param){
        int result =0;
        try{
            result = intermediateOperation(param);
        } catch(WrongInputException e ){
            e.printStackTrace();
        }

        return result;
    }
}
