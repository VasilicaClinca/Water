package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        String [] group1 = {"Ali", "Layan", "Aysenur"};//3
        String [] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valery"};// 5

        String [] students = new String[group1.length + group2.length];//8

        int i = 0;

        for (String each : group1){
            students [i++] = each;
        }

        for (String each : group2){
            students [i++] = each;
        }

        System.out.println(Arrays.toString(students));

        System.out.println("_----------------------------------------------------------------------------------");

        char [] ch1 = {'A','B', 'C'};//3
        char [] ch2 = {'E', 'F', 'G', 'H'};// 4

        char [] chars = new char[group1.length + group2.length];//7

        int j = 0;

        for (char ch : ch1){
            chars [j] = ch;
            j++;
        }

        for (char ch : ch2){
           chars [j] = ch;
           j++;

        }

        System.out.println(Arrays.toString(chars));

    }
}
