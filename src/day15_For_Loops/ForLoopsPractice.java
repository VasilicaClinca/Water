package day15_For_Loops;

public class ForLoopsPractice {

    public static void main(String[] args) {

        for (int i = 15; i <= 45; i++){
            System.out.print(i + " ");// i:
        }

        System.out.println();
        System.out.println("Hello");

        //100 99 98 97 ....50

        for (int i = 100; i>= 50; i--){// i:100 99 98 97 ....50  ( >= , <= , > , < )
            System.out.println(i + " ");


        }

        System.out.println();

        System.out.println("------------------------------------------------------------------------");

        // print all the even number between 1 ~ 55

        for (int i = 1; i <= 55; i++){

            if(i % 2 == 0){
                System.out.println(i + " ");
            }


        }
        System.out.println();

        System.out.println("--------------------------------------------------------------------------");

        for (int i = 2; i<=54; i += 2){ // i:2, 4, 5, 6,..........54;
            System.out.println( i + " ");
        }







    }



}
