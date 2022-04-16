package day10_nestedIfIntro;

public class TernariesWithNestedIf {


    public static void main(String[] args) {

        int s = 85;

/*
        String result = "";// temporary variable

        if (s >= 0 && s <= 100) {
            //5 possibilities
            if (s >= 90) {
                result = "Excellent";
            } else if (s >= 80) {
                result = "Great";
            } else if (s >= 70) {
                result = "Good";
            } else if (s >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {
            result = "Invalid score";

            System.out.println("result = " + result);
        }
    }
/*

}



 */


        String result = (s >= 0 && s <= 100) ? (s >= 60) ? "Passed" : "Failed" : "InvalidScore";

    }
}




