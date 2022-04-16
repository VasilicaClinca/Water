package day09_IfStatements2;

public class MediaNumber {
    public static void main(String[] args) {

      int a = 10,
          b = 15,
          c = 20;
      // if we have 3 different numbers, one must be minimum, one must be medium and another must be a maximum

      boolean aIsMedian = (a > b && a < c)||( a > c && a < b);
      boolean bIsMedian = (b > c && b < a) || (b > a && b < c);
      boolean cIsMedian = !aIsMedian && !bIsMedian;

      if(aIsMedian){// if a is the median number
          System.out.println(a + " is the media number");
          /*
          in oder for a to be median number :
          1. if c is the maximum number & b is the minimum number, the a is the median number
          2. if b is the maximum number and  c is the minimum number, then a is the median number
           */
      }
        if(bIsMedian){// if b is the median number
            System.out.println(b + " is the medium number");
        }

        if(cIsMedian){//if c is the median number
            System.out.println(c + " is the medium number");
        }






    }



}
