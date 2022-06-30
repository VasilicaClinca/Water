package day41_Exceptions;

public class Thread {
    public static void main(String[] args) {

        System.out.println("Hello");

        try {
         java.lang.Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Cydeo");


    }
}
