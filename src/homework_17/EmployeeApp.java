package homework_17;

import lesson_17.Person;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee mike = new Employee("Mike", 39, 10000.0);
        System.out.println(mike.info());

        Employee bill = new Employee("Bill", 50, 5000.50);
        System.out.println(bill.info());

        mike.setAge(40);
        mike.setSalary(12000);

        System.out.println(mike.info());


    }
}
