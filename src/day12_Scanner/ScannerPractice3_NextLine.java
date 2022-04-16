package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Enter

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();//Wooden SpoonEnter

        System.out.println("Enter your Programming Language: ");
        String Programming = input.next();//Java ProgrammingEnter

        System.out.println("Enter your age: ");
        int age = input.nextInt(); //24

        input.nextLine();//to capture the Enter that user pressed for next Int()

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();


        System.out.println("fullName =" +fullName);
        System.out.println("Programming" + Programming);

        input.close();





    }



}
