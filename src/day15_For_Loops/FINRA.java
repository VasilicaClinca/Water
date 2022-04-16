package day15_For_Loops;

public class FINRA {

    public static void main(String[] args) {

       for (int i =1; i <= 100; i++) {//i: 1 2 3.....100
           if (1 %15 == 0) {
               System.out.print("FINRA");// 15 30 45 60...90
           }else if ( i % 3 == 0){
               System.out.print("FIN");// 3 6 9 ....99
           }else if (i % 5 == 0){
               System.out.print("RA");//5 10 15...100
           }else{
               System.out.print(i +" ");
           }

        }






    }



}
