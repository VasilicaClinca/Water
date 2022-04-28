package day37_Inheritance.phoneTask;

public class phoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("iphone 12", "6.7 inches", 1000,"Black");

        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900,"White");

        Nokia nokia = new Nokia("Brick", "4 inches", 50,"Gray");


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);


        iphone.call(911);
        iphone.text(123456678);
        iphone.faceTime(123456778);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("===================================================================");

        samsung.call(911);
        samsung.text(123456678);
        samsung.freeze();


        System.out.println("====================================================================");

        nokia.call(911);
        nokia.text(123456678);
        nokia.selfDefence();

        System.out.println("__________________________________________________________________----");


        System.out.println(Phone.hasBattery);
        System.out.println(iphone.hasBattery);
        System.out.println(samsung.hasBattery);
        System.out.println(nokia.hasBattery);








    }

}
