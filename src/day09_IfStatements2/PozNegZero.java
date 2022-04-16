package day09_IfStatements2;

public class PozNegZero {

    public static void main(String[] args) {

        int n = 100;
        boolean positive = n>0;
        boolean negative = n<0;

        if (positive) {
            System.out.println("Positive");
        }else if(negative ){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

//12 statements: one if, 10 else ifs, and one else====> one statement is printed




    }
}
