package lab1;

public class FizzBuzz {
    private int number = 0;

    public FizzBuzz(int number){
        this.number=number;
    }
    public void print(){
        if( (this.number % 3 == 0)  && (this.number % 5 == 0) ){
            System.out.print("FizzBuzz, ");
        }
        else if(this.number % 3 ==0 ){
            System.out.print("Fizz, ");
        }
        else if(this.number % 5 == 0 ){
            System.out.print("Buzz, ");
        }
        else if(this.number % 7 == 0 ){
            System.out.print("Rizz, ");
        }
        else if(this.number % 11 == 0){
            System.out.print("Jazz, ");
        }
        else{
            System.out.print(this.number + ", ");
        }
    }
}
