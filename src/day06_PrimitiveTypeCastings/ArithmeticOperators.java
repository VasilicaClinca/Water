package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("12" + 1); //121
        System.out.println(10 + 20); //30
        System.out.println(100 - 50);//50
        System.out.println(10*6);//60

        System.out.println(100 / 3);//33
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.5
        System.out.println(10d/4);//2.5

        int a = 100;
        double b = a/6;//16.0
        System.out.println(b);

        double c = (double)a/6; //16.66666
        System.out.println(c);

        System.out.println(100D);



       // 20.0/6 = 3.333...
       // 10/2 = 5
        /*
        remainder = numerator - (denominator * result)
                     10       - (3 * 3) = 1
                     1 / 3 = 0.3333...
                     10 % 3===> 1
         */









    }

    /*
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division

    integer/ integer ====>integer
    decimal/integer ======> decimal

    in math: 10/4 = 2.5
    100
    in java: 10.0/4 = 2
    %: Remainder

     */







}
