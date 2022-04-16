package day16_For_Loops_String_Practice;

public class ReverseStringWithForLoops {

    public static void main(String[] args) {

        String str = "WoodenSpoon";
        String result = "";

        for (int i = str.length() - 1; i>= 0; i--){// i: index numbers of str (starting last index to index 0)
        result += str.charAt(i);// adding each character to result

        }

    //
        System.out.println(result);


    }







}
