package day26_CustomMethodsPractice;

public class FrequencyOfElement {


    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 11, 1, 1, 1, 3, 3, 3, 4, 4, 1, 1, 1, 1};

        int n = frequecyOfElement(arr, 1);
        System.out.println(n);
    }

    // returns the frequency of the given element  from a given array
    public static int frequecyOfElement(int[] array, int element) {

        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;

    }

    // returns the frequency of the given element  from a given array
    public static int frequecyOfElement(double[] array, double element) {

        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }

    // returns the frequency of the given element  from a given array
    public static int frequecyOfElement(char[] array, char element) {

        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }

    // returns the frequency of the given element  from a given array
    public static int frequecyOfElement(String[] array, String element) {

        int count = 0;
        for (String each : array) {
            if (each.equals(element) ){
                count++;
            }
        }

        return count;
    }

}


