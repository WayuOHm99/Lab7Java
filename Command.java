import java.util.Scanner;

public class Command {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your id: ");
        int id = scanner.nextInt();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        Employee employee;
        if (id <= 0) {
            System.out.println("Invalid ID " + id + "!!");
            return;
        } else if (id <= 500) {
            employee = new Manager(id, salary);
        } else {
            employee = new Worker(id, salary);
        }

        double newSalary = employee.calSalary();
        System.out.println("You are " + employee.getClass().getSimpleName() + ".");
        System.out.printf("Your new salary is %.2f Baht.\n", newSalary);
    }
}
