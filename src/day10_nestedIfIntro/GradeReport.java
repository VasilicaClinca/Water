package day10_nestedIfIntro;

public class GradeReport {

    public static void main(String[] args) {

        int score = 95;

        String result = "";// temporary variable

        if (score >= 0 && score <= 100) {
            //5 possibilities
            if (score >= 90) {
                result = "Excellent";
            } else if (score >= 80) {
                result = "Great";
            } else if (score >= 70) {
                result = "Good";
            } else if (score >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {
            result = "Invalid score";

            System.out.println("result = " + result);
        }
    }





        }





