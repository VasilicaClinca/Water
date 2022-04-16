package day08_ifStatements;

public class GradeReport {

    public static void main(String[] args) {
/*


        System.out.println(true == !false);
        System.out.println(!true != false);
        System.out.println(!false == true);

        System.out.println(!!false);
        System.out.println(!!!true);
        /*



       /*
       score 90~100===> Excelent
         80`89 ===> great
         70~89 ===> good
         60~79====> passed
         0`59====> failed
 */

   int score = 85; // 0 ~ 100

        boolean a = score >= 90 && score <= 100;

        boolean b = score >= 80 && !a; // if score is A, but greater than 80
                             // boolean  b = score >= 80 && score>= 89;

        //boolean c = score >= 70 && score >= 79;
        boolean c = !a && !b && score >= 70;


        boolean d = score >= 60 && score <= 69;
       // boolean d = !a && !b && !c;

        boolean f = score >= 0 && score <= 59;
         //boolean f = score !a && !b && !c && !d;

        if (a) { // if student made a
            System.out.println("Excelent"); // false
        }
        if (b) {// if student made b
            System.out.println(" Great");//true
        }
        if (c) {//if student made c
            System.out.println("Good");//false
        }
        if (d) {//if student made d
            System.out.println("Passed");//false
        }
        if (f) {// if student made f
            System.out.println("Failed");//false
        }
















    }
}
