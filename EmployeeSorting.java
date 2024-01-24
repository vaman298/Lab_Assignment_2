import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee {
    private String employeeId;
    private String name;
    private int age;
    private double salary;

    public Employee(String employeeId, String name, int age, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee("161E90", "Ramu", 35, 59000));
        employees.add(new Employee("171E22", "Tejas", 30, 82100));
        employees.add(new Employee("171G55", "Abhi", 25, 100000));
        employees.add(new Employee("152K46", "Jaya", 32, 85000));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sorting parameter (1. Age, 2. Name, 3. Salary):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(employees, Comparator.comparing(Employee::getAge));
                break;
            case 2:
                Collections.sort(employees, Comparator.comparing(Employee::getName));
                break;
            case 3:
                Collections.sort(employees, Comparator.comparing(Employee::getSalary));
                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("Sorted Employee Data:");
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getSalary());
        }
    }
}
