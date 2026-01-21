import java.util.Scanner;

class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    int getId() {
        return id;
    }

    String getDepartment() {
        return department;
    }

    void setName(String name) {
        this.name = name;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return this.id == other.id;
    }

    public String toString() {
        return "Employee[ID=" + id +
                ", Name=" + name +
                ", Department=" + department +
                ", Salary=" + salary + "]";
    }
}

public class Solution {

    static Employee[] employees = new Employee[20];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee by ID");
            System.out.println("6. Count Employees by Department");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    searchEmployee();
                    break;
                case 6:
                    countByDepartment();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void addEmployee() {

        if (count == employees.length) {
            System.out.println("Employee storage full");
            return;
        }

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].equals(new Employee(id, "", "", 0))) {
                System.out.println("Employee with ID " + id + " already exists! Cannot add duplicate.");
                return;
            }
        }

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees[count++] = new Employee(id, name, dept, salary);
        System.out.println("Employee added successfully!");
        displayEmployees();
    }

    static void displayEmployees() {

        if (count == 0) {
            System.out.println("No employees to display");
            return;
        }

        System.out.println("\nCurrent Employees:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + employees[i]);
        }
    }

    static void updateEmployee() {

        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {

                sc.nextLine();
                System.out.print("Enter new Name: ");
                employees[i].setName(sc.nextLine());

                System.out.print("Enter new Department: ");
                employees[i].setDepartment(sc.nextLine());

                System.out.print("Enter new Salary: ");
                employees[i].setSalary(sc.nextDouble());

                System.out.println("Employee updated successfully!");
                return;
            }
        }

        System.out.println("Employee not found");
    }

    static void deleteEmployee() {

        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted successfully!");
                return;
            }
        }

        System.out.println("Employee not found");
    }

    static void searchEmployee() {

        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                System.out.println("Found Employee:");
                System.out.println(employees[i]);
                return;
            }
        }

        System.out.println("Employee not found");
    }

    static void countByDepartment() {

        sc.nextLine();
        System.out.print("Enter department to count: ");
        String dept = sc.nextLine();

        int deptCount = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getDepartment().equalsIgnoreCase(dept))
                deptCount++;
        }

        System.out.println("Number of employees in " + dept + ": " + deptCount);
    }
}
