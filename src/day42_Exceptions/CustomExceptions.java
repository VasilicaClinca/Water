package day42_Exceptions;


class FadyException extends RuntimeException{

}
class NoBreakException extends Exception{

}


public class CustomExceptions {


    public static void main(String[] args) {

       // throw new FadyException("It s time for lunch break");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }















}
