package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {

    public static void main(String[] args) {

        //index of elements:       0 1 2     0 1 2 3     0 1  2  3  4
            int [][] arr2D =    { {1,2,3} , {4,5,6,7} , {8,9,10,11,12} };
        // index of arrays:          0          1              2

        System.out.println( Arrays.deepToString(arr2D) );

        //{4,5,6,7}
        System.out.println( Arrays.toString(arr2D[1]) );

        // 11
        System.out.println(arr2D[2][3]);















    }
}
