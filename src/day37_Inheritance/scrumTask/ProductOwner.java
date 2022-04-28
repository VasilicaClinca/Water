package day37_Inheritance.scrumTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, jobTitle, ID, salary, companyName);
    }

    public void gatherRequirements(){
        System.out.println(jobTitle + " " + name + " is gathering requirements");
    }
}
