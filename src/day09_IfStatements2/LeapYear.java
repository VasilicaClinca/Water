package day09_IfStatements2;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;

        boolean leapYear = year % 4 == 0;

        if (leapYear){
            System.out.println("Year" +year + "is leap year");
        }

        if(!leapYear){
            System.out.println("Year " + year +"is NOT a leap Year");

        }

        System.out.println("----------------------------------------");


        if (leapYear){
            System.out.println("Year" +year + "is leap year");
        }else{
            System.out.println("Year " + year +"is NOT a leap Year");
        }// it is better to use an independent "if statement" rather than 2








    }
}
