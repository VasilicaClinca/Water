package day15_For_Loops;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;// smallest number int, any user entered number will be greater than this

        for (int i = 0; i < 5  ; i++) {

            System.out.println("Enter a number:");
            int num = scan.nextInt();//1, 2, 3, 1

            if (num >max){//if the user entered number is greater than current maximum number
                max = num;
            }


        }
        System.out.println("max = " + max);
        scan.close();




    }
}
