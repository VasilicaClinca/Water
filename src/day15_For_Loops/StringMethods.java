package day15_For_Loops;

public class StringMethods {

    public static void main(String[] args) {

        String str = "  ";

        boolean r = str.isEmpty();
        System.out.println("r = " + r);

        boolean r1 = str.isEmpty();
        System.out.println("r1 = " + r1);

        String str2 = "Cydeo  ";
        System.out.println(str2.isBlank());

        System.out.println("-----------------------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));// true
        System.out.println(s2 .equalsIgnoreCase(s2));//true

        System.out.println("yEs".equalsIgnoreCase ("YES"));

        System.out.println("---------------------------------------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean r3 = sentence.contains("Java") || sentence.contains("java");// jAvA


        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("Java = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);


        System.out.println("------------------------------------------------------------------");

        String input1 = "I love jAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase((input2)));//false

        System.out.println(input1.contains("Java"));//false

        System.out.println(input1.toLowerCase().contains("java"));// true
        System.out.println(input1.toUpperCase().contains("JAVA"));// true

        System.out.println("---------------------------------------------------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");
        // in order to ignore the case sensitivity we first create to lower/upper case of string and then

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);












    }
}
