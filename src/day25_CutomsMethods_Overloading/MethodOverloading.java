package day25_CutomsMethods_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {

        int [] intArray = {5, 6, 0,-1, 3 ,4};
        Arrays.sort(intArray);

        double [] doubleArray = { 5.5, 6.5, -1.5, 3.5, 4.5};
        Arrays.sort(doubleArray);

        char [] charArray = {'F','C', 'A', 'D', 'B'};
        Arrays.sort(charArray);

        System.out.println("---------------------------------------------------------------------");


        int sum1 = sumOfNumbers(10,20);

        int sum2 = sumOfNumbers(10,20,30);

        int sum3 = sumOfNumbers(10,20,30,40);

        double sum4 = sumOfNumbers(18.2, 30.7);

        double sum5 = sumOfNumbers(23.5, 34.6, 56.6);


        sumOfNumbers(10,20,30,30);
        

    }

    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static int sumOfNumbers (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static double sumOfNumbers (double num1, double num2, double num3 ){
        return sumOfNumbers( num1, num2 ) + num3;
    }

    public static int sumOfNumbers (int num1, int num2, int num3, int num4) {
        return sumOfNumbers (num1, num2, num3 )+ num4;
    }

    public static double sumOfNumbers (double num1, double num2, double num3, double num4) {
        return sumOfNumbers (num1, num2, num3 )+ num4;
    }






}
