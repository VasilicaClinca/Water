package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "HusKy", 'M', 2, "Small", "Black");
        
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.hunt();
        //dog.scratch();

        System.out.println(dog);

        Cat cat = new Cat ();
        cat.setInfo ("Luna", "British", 'F', 2,  "Medium", "Black&White");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
       // cat.bark();
       // cat.hunt();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo ("SherKhan", "Bengal", 'M', 4, "Large", "Black&White");
        
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.roar();
        // tiger.bark();
         tiger.hunt();
       // tiger.scratch();

        System.out.println(tiger);
    }
}
