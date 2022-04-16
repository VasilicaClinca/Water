package day19_LoopsPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";// bdf

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);// each character from string
            int count = 0;// represents the frequency of char

            for (int i = 0; i < str.length(); i++) {//to find the frequency of each character,
                                                 // compares the character that outer loop picked, with each character
                char each = str.charAt(i);// each character of string
                if (ch == each) {
                    count++;
                }
            }

            if (count == 1) {// if the character is unique
                result += ch;

            }

            System.out.println(result);
        }


    }
}