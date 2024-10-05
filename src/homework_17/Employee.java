package homework_17;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String info() {
        return String.format("Employee %s, Age: %d, Salary: %s", name, age, salary);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }

    }
    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        }
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }

    }

}
