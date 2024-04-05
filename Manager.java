package employee;

public class Worker extends Employee {

    public Worker(int id, double salary) {
        super(id, salary);
    }

    @Override
    public double calSalary() {
        double raise = 1000;
        if (salary > 6000) {
            raise = 500;
        }
        return salary + raise;
    }
}
