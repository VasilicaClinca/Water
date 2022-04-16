package day21_ForEachLoop;

 import java.util.Arrays;

public class ArrayUtility2 {

    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron"};
        String[] earlyBirds = Arrays.copyOf(students, 2);

        System.out.println(Arrays.toString(earlyBirds));

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers, 5);//{1,2,3,4,5}

        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------------------------------------------------------");

        char [] ch1 = {'A','B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char [] ch2 = Arrays.copyOfRange (ch1, 2,6+1);

        System.out.println(Arrays.toString (ch2));


       int [] n1 = {10, 20, 30, 40, 50,60,70,80, 90, 100};
        int [] n2 = Arrays.copyOfRange (n1, 2,8);

        System.out.println(Arrays.toString (n2));










    }
}
