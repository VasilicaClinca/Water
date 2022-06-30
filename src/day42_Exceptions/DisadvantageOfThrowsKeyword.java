package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) {

        System.out.println("Hello");

        //sleep(2.5);// throws //temporary solution, local, for checked exceptions only

        System.out.println("Hello world");

        System.out.println("----------------------------------------------------------------");

        System.out.println("Hello");

        MorningWorkOut.sleep(2.5); //try & catch is the permanent solution

        System.out.println("Cydeo");
    }

    public static void sleep (double seconds) throws InterruptedException{

        Thread.sleep((long) (seconds * 1000));
    }

}
