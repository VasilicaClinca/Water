package day13_String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";
        char thirdChar = word.charAt(2);
        System.out.println("thirdChar " + thirdChar);

      /*  char nineChar = word.chars(9);
        System.out.println("nineChar = " + nineChar);
        needs to be in the number of the characters of the word
       */
        System.out.println("----------------------------------------------");

        String s1 = "Batch 08 is the best batch";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(   s1.length()-1   );//the last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("--------------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();//WOODEN SPOON

        //Today is agreat day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence.toUpperCase();

        System.out.println(sentence);

        String s ="JAVA";
       s =  s.toLowerCase();


        System.out.println(s);




    }
}
