package day18_NestedLoops;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 30;// 30 - 7 = 23 -7 = 16 - 7 = 9- 7 = 2
        int b = 7;

        int count = 0;

        while ( a >= b ){// count = 1 + 1 = 2 + 1 = 3 + 1 = 4
            a -= b;
            count++;

        }

        System.out.println(count + " with a remainder of " + a);




    }
}
