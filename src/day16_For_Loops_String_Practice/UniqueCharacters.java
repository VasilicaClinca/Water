package day16_For_Loops_String_Practice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccc";
        String result = "";

        for (int i = 0; i < str.length() - 1; i++) {// i: index numbers of str (starting from 0)

            char ch = str.charAt(i);// ch: each character of str


            if (str.indexOf(ch) == str.lastIndexOf(ch)) { //if the first and last index numbers of the character are the same, then it must be a unique character
                result += ch;
            }

            // char ch = 'b';
            // 3                     == 3

        }

        System.out.println(result);
    }
}


