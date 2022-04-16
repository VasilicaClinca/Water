package day17_While_DoWhileLoops;

public class BranchingStatements2 {
    public static void main(String[] args) {


        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue;// skips 'C'
            }

            System.out.println(i);// A B D E

        }
        System.out.println("--------------------------------------------------------");

        // print all even numbers 1 ~ 10

        for (int i = 0; i < 11; i++) {// i:1

            if (i % 2 != 0) {
                continue;// Skip

            }
            System.out.println(i);// 2 4 6 8

        }
        System.out.println("-------------------------------------------------------");
        // print all odd numbers 1 ~1 0

        for (int i = 0; i < 11; i++) {// i:1..10

            if (i % 2 == 0) {
                continue;// Skip
            }
            System.out.println(i);


        }


    }
}

