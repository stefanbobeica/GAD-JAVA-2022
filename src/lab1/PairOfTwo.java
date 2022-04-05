package lab1;
import java.util.Arrays;



public class PairOfTwo {
    private  Integer[] array;
    public PairOfTwo( Integer[] array){
        this.array=new Integer[array.length];
        this.array=array;
    }
    public  int pairs(){
        int count=0;
        Integer[] index;
        index= new Integer[this.array.length];
        for (int i=0; i<this.array.length-1; i++)
            for(int j=i+1; j<this.array.length; j++){
                if((this.array[i]-this.array[j])==0 ){
                    if(Arrays.asList(index).contains(i)||Arrays.asList(index).contains(j)){
                        ;
                    } else{
                        count++;

                    }

                }
            }
        return count;
    }
}
