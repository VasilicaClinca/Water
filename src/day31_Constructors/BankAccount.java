package day31_Constructors;

public class BankAccount {


    public String accountHolder;
    public long accountNumber;
    public double balance;


    public void setInfo(String accountHolder, long accountNumber) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checKBalance (){
        System.out.println("Your available balance is: " + balance);
    }

    public void deposit (double amount){
        if (amount <= 0){
            System.out.println("Depositing amount can be zero or negative");
            return;//exists the method if the amount is invalid
        }
        balance += amount;
    }

    public void withdrawing (double amount) {
      if (amount > balance){// if the withdrawing amount is greater  than the available balance
        System.out.println("Insuficient balance");
        return;}


        if( amount <= 0){// if the withdrawing amount is negative or zero
            System.out.println("Withdrawing amount can not be negative or zero");
            return;
        }
        balance -= amount;
    }






}
