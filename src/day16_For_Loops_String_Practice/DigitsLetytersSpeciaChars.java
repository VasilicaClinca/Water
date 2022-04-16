package day16_For_Loops_String_Practice;

public class DigitsLetytersSpeciaChars {

    public static void main(String[] args) {

        String str = "Cydeo1234567890School) ( *&^%$£@!WoodenSpoon";

        String digits = ""; //12345.....
        String letters = "";// CydeoSchoolWoodenSpoon
        String specialChars = ""; // )(*&^%$£@!

        for (int i = 0; i < str.length()  ; i++) {// index number of str (0 ~ last index)

            char ch = str.charAt(i); // ch:each character that we have in str

            if (ch >= '0' && ch <= '9') { // if the character is between '0' to '9' then is digit
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {// if the character is between 'A' to 'Z' then is letter
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {// if the character is between 'a' to 'z' then is letter
                specialChars += ch;
            } else {// if the character is neither a digit nor a letter, then is a special character
                if (ch != ' ') { // if the special character is not a space
                    specialChars += ch;
                }

            }

        }


        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);



        }








    }

