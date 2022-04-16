package day24_CutomsMethods_Return;

public class ReturnStatement2 {

    public static void main(String[] args) {


        nameOfMonth(10);
    }

    public static void nameOfMonth (int number){

        if (number <1 || number > 12) {
            System.out.println("Invalid");
            return;// exits the nameOf Month method, remaining code fragment of the method never gets executed
        }

        String name ="";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4)
                    ? "April" : (number == 5) ? "May" : (number == 6) ? "Jun" : (number == 7) ? "Jul" :
                    (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct" : (number == 11)
                            ? "Nov" : "Dec";
        }else{
            name = "Invalid" ;
        }
        System.out.println("Month name = " + name);
    }

}
