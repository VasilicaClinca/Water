package day20_Array;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char [] letters = new char[26];

/*
        for (int i = 0; j = 'A'; i < letters.length; i++; j++){//i: index numbers 0~ last index
            letters[i]=(char)j;
 */
        char ch ='A';
        for (int i = 0; i <letters.length ; ch++) {
            letters[i]= ch;

            System.out.println(Arrays.toString(letters));

        }

        System.out.println(Arrays.toString(letters));// [A~Z]
        }


    }

