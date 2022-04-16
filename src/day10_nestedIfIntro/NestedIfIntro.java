package day10_nestedIfIntro;

public class NestedIfIntro {

    public static void main(String[] args) {


        int score = 95;

        if (score >= 0 && score <= 100) { // if the score is valid


            if (score >= 60) {//if student passed the exam
                System.out.println("Passed");

            } else {//if the student failed the exam
                System.out.println("Failed");
            }

        } else {// if the score is not valid
            System.out.println("Invalid score");


        }

        System.out.println("-------------------------------------------------------");

        int age = 19;
        boolean hasId = true;

        if (hasId) {
            if (age >= 21) {// if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }
        } else {//if the person does not have an ID
            System.out.println("You must have an ID to buy alcohol");

            System.out.println("-----------------------------------------------------");

            int n = 7;

            if (n >= 1 && n <= 7) {
                //if the number is a valid number
                //7 options
                if (n == 1) {
                    System.out.println("Monday");


                } else if (n == 2) {
                    System.out.println("Tuesday");


                } else if (n == 3) {
                    System.out.println("Wednesday");


                } else if (n == 4) {
                    System.out.println("Thursday");


                } else if (n == 5) {
                    System.out.println("Friday");


                } else if (n == 6) {
                    System.out.println("Saturday");


                } else if (n == 7) {
                    System.out.println("Sunday");
                }

            } else {//if the number is not valid
                System.out.println("Invalid Number");


            }


        }


    }

}



