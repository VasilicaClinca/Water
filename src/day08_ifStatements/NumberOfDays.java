package day08_ifStatements;

public class NumberOfDays {

    public static void main(String[] args) {

       int number = 5;

       boolean has28Days = number == 2; // for the month that has 28 days
       boolean has30Days = number ==4 || number == 4|| number == 6|| number == 9 || number == 11; //for the months that have 30 days
       boolean has31Days = !has28Days && !has30Days;// for the month that have 31 days

        if(has28Days ) {
            System.out.println("28Days");// if the month has 28 days
        }
        if (has30Days) {
            System.out.println("has30Days");//if the month has 30 days
        }
        if (has31Days){
            System.out.println("has31Days");//if the month has 31 days

        }


    }
}
