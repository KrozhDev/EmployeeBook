import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        Employee emp1 = new Employee("Иван", "Иванов", "Иванович", Department.FIRST, 150_000);
        System.out.println(emp1.getId());
        Employee emp2 = new Employee("Петр", "Петрович", "Иванович", Department.FIRST, 200_000);
        System.out.println(emp2.getId());

        employees[0] = emp1;
        employees[1] = emp2;
        employees[3] = new Employee("Богдан", "Каркаев", "Андреевич", Department.SEC, 100_000);

        printEmployees();
        System.out.println(totalSalary());
        System.out.println(minSalaryEmployee().toString());
        System.out.println(maxSalaryEmployee().toString());
        System.out.println(averageSalary());
        printFIO();

    }

    public static void printEmployees() {
        for (Employee emp: employees) {
            if (emp != null) {
                System.out.println(emp.toString());
            }
        }
    }

    public static int totalSalary() {
        int total = 0;
        for (Employee emp: employees) {
            if (emp != null) {
                total += emp.getSalary();
            }
        }
        return total;
    }

    public static Employee minSalaryEmployee() {
        int minSalary = Integer.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee emp: employees) {
            if (emp != null) {
                if (emp.getSalary() < minSalary) {
                    minSalary = emp.getSalary();
                    employeeWithMinSalary = emp;
                }
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee maxSalaryEmployee() {
        int maxSalary = 0;
        Employee employeeWithMaxSalary = null;
        for (Employee emp: employees) {
            if (emp != null) {
                if (emp.getSalary() > maxSalary) {
                    maxSalary = emp.getSalary();
                    employeeWithMaxSalary = emp;
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public static double averageSalary() {
        int counter = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                counter++;
            }
        }
        return (double) (totalSalary() / counter);
    }

    public static void printFIO() {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp.getSurname() + " " + emp.getName() + " " + emp.getFatherName());
            }
        }
    }

}