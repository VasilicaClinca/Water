package day23_CutomsMethods;

public class CustomMethodPractice {

    public static void main(String[] args) {

        helloWorld5Times();
        System.out.println("----------------------------------------------");
        helloCydeo5Times();
        System.out.println("----------------------------------------------");
        evenNumbers();

    }

    public static void helloWorld5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        System.out.println("------------------------------------------------------------------------------");
    }

    public static void helloCydeo5Times() {

            for (int i = 0; i < 5; i++) {
                System.out.println("Hello Cydeo!");
            }


    }


    // create a function that can print all the even numbers from 1 ~ 10

    public static void evenNumbers(){

        for (int i = 2; i < 11 ; i+= 2) {
            System.out.println(i);

        }
    }








}
