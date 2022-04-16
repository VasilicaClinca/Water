package day17_While_DoWhileLoops;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAABBBC";

        char ch = 'A';

        int frequency = 0;//1+1+1

        for (int i = 0; i <= str.length() - 4 ; i++) {// indexes of str
            char eachChar = str.charAt (i);// eachChar: each character of str


            if (ch == eachChar){// if ch is matching with the eachChar, then ch is appeared in the string
                frequency++;
            }

        }

        System.out.println(frequency);



    }
}
