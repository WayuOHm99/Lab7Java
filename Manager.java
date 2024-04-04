public class Manager extends Employee {

    public Manager(int id, double salary) {
        super(id, salary);
    }

    @Override
    public double calSalary() {
        double raise = 0.04;
        if (id > 300) {
            raise = 0.06;
        }
        return salary + (salary * raise);
    }
}
