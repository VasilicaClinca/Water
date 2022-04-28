package day34_GarbageCollections_AccesModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    static{// runs before anything and runs only one time
        System.out.println("Static Block");
    }
}
