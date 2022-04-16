package day17_While_DoWhileLoops;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", " ");
            frequency++;
        }

        System.out.println(frequency);

        System.out.println("----------------------------------------------------------");

        String sentence = "cat cat cat cat cat dog dog cat";

        int countCat = 0;

        while (sentence.contains ("cat")){
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println(countCat);

        System.out.println("----------------------------------------------------------------------");

        String s = "java java java python python python";

        int CountJava = 0;
        int CountPython = 0;

        while(s.contains ("java") || s.contains("python")){

            if (s.contains("java")){
                s = s.replaceFirst("java", "");
                CountJava++;
            }

            if (s.contains("python")) {
                s = s.replaceFirst("python", "");
               CountPython++;

            }

        }

        System.out.println("Countjava = " + CountJava);
        System.out.println("Countpython = " + CountPython);


















    }
}
