package day20_Array;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,1,0};
        int max = numbers[0];// 20

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max){// if there is an element in the array that s greater than
                max = numbers[i];// assigning greater number to variable max
            }
        }

        System.out.println(max);

        System.out.println("-------------------------------------------------------------------------");
















    }
}