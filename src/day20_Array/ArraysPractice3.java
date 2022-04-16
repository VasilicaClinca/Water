package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int lenght = scan.nextInt(); // 20

        if (lenght <= 0){
            System.err.println("Invalid Entry");
           System.exit(0 );
        }

        int[] numbers = new int[lenght];// array needs to have enough capacity to contain all the elements
                                           // user is going to provide


        for (int i = 0; i < lenght; i++) {// i: 0,1,.....
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();// each input user provided during each execution of the loop wil be assingned to
            //to the indexes of the array

            System.out.println(Arrays.toString(numbers));

            scan.close();


        }


    }
}
