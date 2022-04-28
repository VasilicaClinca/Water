package day34_GarbageCollections_AccesModifiers;

public class AccesModifiers {

    public static int publicData = 100;
    static int defaultData = 200;// doesn t use the default, it s implicit
    private static int privateData = 300;

    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);



    }







}
