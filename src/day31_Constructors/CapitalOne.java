package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount ();
        account1.setInfo("Ahmet Ozkok", 123456789);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checKBalance();

        account1.withdrawing(900);

        account1.checKBalance();

        System.out.println("-----------------------------------------------------------------------------------------------");


        BankAccount account2 = new BankAccount ();
        account1.setInfo("Aygun", 987654321);

        account2.deposit(900);
        account2.checKBalance();

        account2.withdrawing(700);

        account2.checKBalance();


    }
}
