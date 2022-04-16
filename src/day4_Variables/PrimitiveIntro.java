package day4_Variables;

public class PrimitiveIntro {

    public static void main(String[] args) {
    // age:38 years old
      byte age = 38;

      // weight: 160 pounds
       // byte weight = 160; //160 is out of range of byte - we can use short
        // byte num = -129; // -129 is out of byte' range

        short weight = 160; //160 is within the range of short



        //salary: 100000 $
        //short salary = 100000 $; //100000 is out of short' range
        int salary = 100000; // int is preferred data type for the integer numbers

        //int asset = 3333333333; // too long for int better use long primitive type

        //long asset = 3333333333333L; // type L for the compiler to recognize the long primitive type
        // unlikely to use



        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;

      //#
        char ch1 = '#'; // designed for single characters
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        char grade = 'F';
        char yesNo = 'Y';

        // boolean fot true or false (or expression)

      boolean isEmployeed = true;
      boolean isMarried = true;
      boolean result = 100 > 300; //expression


      //String: sequence of characters or (String of text);

      String name = "Wooden Spoon";
      String city = "London";
      String state = "California";














    }

}
