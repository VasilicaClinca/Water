package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Suhaib", 29, 'M', "PO", 1, 160000, company);

        BussinesAnalyst ba = new BussinesAnalyst("Cihaid", 30, 'M', 2, 150000, company);

        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 3, 145000, company);

        Tester tester1 = new Tester("Chinara", 28, 'F', "QA", 123, 125000, company);
        Tester tester2 = new Tester("Yasmin", 32, 'F', "QE", 124, 135000, company);
        Tester tester3 = new Tester("Bogdan", 30, 'M', "SDET", 125, 140000, company);
        Tester tester4 = new Tester("Tudor", 32, 'M', "QA", 126, 145000, company);

        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Daniela", 27, 'F', "Java Developer", 8, 145000, company);
        Developer developer2 = new Developer("Allison", 29, 'F', "Junior Java Developer", 9, 115000, company);
        Developer developer3 = new Developer("Tom", 30, 'M', "Java Developer", 10, 15500, company);
        Developer developer4 = new Developer("Manas", 40, 'M', "Full Stack Developer", 15, 16500, company);
        Developer developer5 = new Developer("Evelyn", 30, 'F', "JS Developer", 11, 145000, company);

        Developer [] developers = {developer1, developer2, developer3, developer4, developer5};

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);

        scrumTeam.addDevelopers(developers);

        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("--------------------------------------------------------------------");

        for (Tester tester : scrumTeam.testers){
            System.out.println(tester.name + " : " + tester.salary);
        }


        for (Developer developer : scrumTeam.developers){
            System.out.println(developer.name + " : " + developer.salary);
        }
    }
}
