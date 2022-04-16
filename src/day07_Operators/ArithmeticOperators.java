package day07_Operators;

public class ArithmeticOperators {


    public static void main(String[] args) {
        
        int num1 = 25;
        int num2 = 3;
        
        int division = num1/num2;// division variable contains the result of num1 divided by num2
        int remainder = num1%num2;// remainder variable contains the reminder of num1 divided by number
        
        //10 divide by 3 is equal to 3 with a reminder of 1

        int remaider = 0;
        System.out.println(num1 + " diveded by " + num2 + " is equal to " + division + " with the remainder of " + remaider);
        

        // what s the reminder of 25 divided 4:

        System.out.println(25 % 4);

        // what s the remainder of 25 divided 5
        System.out.println(25 % 5);

    }
}
