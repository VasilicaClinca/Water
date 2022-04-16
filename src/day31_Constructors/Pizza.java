package day31_Constructors;

public class Pizza {

   public char size;
   public int numberOfCheeseToppings, numberOfPepperoniToppings;

    public Pizza(char size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        this.size = size;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public double calcCost(){
        double startingPrice = (size == 'S')? 10 : (size == 'M') ? 12: 14;

        double totalPrice = startingPrice + (numberOfCheeseToppings + numberOfPepperoniToppings ) * 2;
        return totalPrice;

    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", totalPrice = $" + calcCost() +
                '}';
    }
}
