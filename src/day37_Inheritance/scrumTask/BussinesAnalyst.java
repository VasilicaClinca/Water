package day37_Inheritance.scrumTask;

public class BussinesAnalyst extends Employee {

    public BussinesAnalyst(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", ID, salary, companyName);
    }

    public void analyze(){
        System.out.println(jobTitle + " " + name + " is analysing the documents");
    }
}
