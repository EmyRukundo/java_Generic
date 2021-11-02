
import java.util.*;
import java.util.stream.Collector;


//Generics it allows us to work on multiple data types in the same one class
class Main{
    public static void main(String[] args){


        NumericFns <Integer> iob = new NumericFns<Integer>(6);
        NumericFns<Double> dob = new NumericFns<Double>(-6.0);

        System.out.println(iob.absEqual(dob));
    }
}