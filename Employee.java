package employee;
public abstract class Employee {

    protected int id;
    protected double salary;

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public abstract double calSalary();

    public void setID(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
