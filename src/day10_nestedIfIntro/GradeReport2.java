package day10_nestedIfIntro;

public class GradeReport2 {

    public static void main(String[] args) {

        int s = 95;

/*
       String result = (s >= 0 && s <= 100)? (s >= 90) ? "Excellent" : (s >= 80) ? "Great"
               : (s >= 70) ? "Good" : (s >= 60) ? "Passed" :  "Failed" : "Invalid Score";

        System.out.println(result);
/*

 */
        System.out.println("----------------------------------------------------------------");

        //solution 3:

        String result2 = "";

        if(s>= 0 && s<= 100) { //if the s is valid (0~100)
            result2 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great"
                    : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";
        }else {//if the s is not valid
            result2 = "Invalid Score";

            System.out.println(result2);


        }
}
}
