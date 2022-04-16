package day19_LoopsPractices;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " Even number");
            } else {
                System.out.println(num + " Odd number");
            }

            System.out.println("Would you like to enter another number? (yes/no)");
            String a = scan.next();

            if (!(a.equalsIgnoreCase("yes") || (a.equalsIgnoreCase("no")))) {// if the answer is invalid
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            if (a.equalsIgnoreCase("no")) {
                System.out.println("Thank you");
                break;
            }
        }
    }
}
