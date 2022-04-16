package day15_For_Loops;

import java.util.Scanner;

public class MinimumNumber {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647;// biggest number int, any user entered number will be smaller than this

        for (int i = 10; i < 15  ; i++) {

            System.out.println("Enter a number:");
            int num = scan.nextInt();//67, 23, 42, 5, -10

            if (num < min){//if the user entered number is smaller than current minimum number
               min = num;
            }


        }
        System.out.println("min = " + min);

        scan.close();
        







    }
}
