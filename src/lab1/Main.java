package lab1;

import lab1.FizzBuzz;

public class Main {
    public static String compute(int number){
        String ret=new String("");

        if(number % 3 == 0){
            ret=ret+"Foo";
        }
       if (number % 5 == 0){
           ret=ret+"Bar";
        }
        if(number % 7 == 0){
            ret=ret+"Qix";
        }
        int aux=number;
        while(number > 0){
            if(number % 10 == 3)
                ret=ret+"Foo";
            if(number % 10 == 5)
                ret=ret+"Bar";
            if(number % 10 == 7)
                ret=ret+"Qix";
            number /= 10;
        }
        if(ret =="")
            ret=Integer.toString(aux);
        return ret;
    }
    public static String compute2(int number){
        String ret=new String("");

        if(number % 3 == 0){
            ret=ret+"Foo";
        }
        if (number % 5 == 0){
            ret=ret+"Bar";
        }
        if(number % 7 == 0){
            ret=ret+"Qix";
        }
        int aux=number;

        while(number > 0){
            if(number % 10 == 3)
                ret=ret+"Foo";
            if(number % 10 == 5)
                ret=ret+"Bar";
            if(number % 10 == 7)
                ret=ret+"Qix";
            if(number % 10 ==0)
                ret=ret+"*";


            number /= 10;

        }
        if(ret =="")
            ret=Integer.toString(aux);
        return ret;
    }
    public static void main(String[] args) {
    /*
       CHALLENGE 1
     for(int i=1; i<=100; i++){
         FizzBuzz nr=new FizzBuzz(i);
         nr.print();
     }
        System.out.println(compute2(105));
   */
       /* Integer[] test= new Integer[]{3,2,-3,-2,3,0,-4,4,0};
        PairOfTwo perechi = new PairOfTwo(test);
     System.out.print(perechi.pairs()); */
        int i=1;
        do{
            System.out.print(i++);
        } while (i != 5);
    }
}
