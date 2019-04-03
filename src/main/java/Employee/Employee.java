package Employee;

public class Employee {
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public final String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

