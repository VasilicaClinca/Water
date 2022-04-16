package day30_CustomClass;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John", 'M', 25, 2237, "Developer", 100000, true);
        employee2.setInfo("Anna", 'F', 28, 2235, "QA", 85000, true);
        employee3.setInfo("David", 'M', 29, 2236, "DqA", 45000, false);
        employee4.setInfo("Lina", 'M', 38, 2239, "Manager", 80000, true);
        employee5.setInfo("Kevin", 'M', 36, 2289, "Senior QA", 110000, true);


        Employee [] employees = {employee1, employee2, employee3, employee4, employee5};
        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees [0].salary;
        double min = employees [0].salary;


        for (Employee employee : employees){

            if (employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }

            if(employee.salary > max){
                max = employee.salary;
            }

            if(employee.salary< min){
                min = employee.salary;
            }
        }
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}