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

        indexSalary(10);
        printEmployees();

        System.out.println(minSalaryDepartment(Department.FIRST));
        System.out.println(maxSalaryDepartment(Department.FIRST));
        System.out.println(totalSalaryDepartment(Department.FIRST));
        System.out.println(averageSalaryDepartment(Department.FIRST));

        indexSalaryDepartment(Department.FIRST, 10);

        printEmployeesDepartment(Department.FIRST);

        printWithSalaryLessThan(150000);


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

    public static void indexSalary(double percent) {
        double index = 1 + percent/100;
        for (Employee emp : employees) {
            if (emp != null) {
                emp.setSalary((int) (emp.getSalary() * index));
            }
        }
    }

    public static Employee minSalaryDepartment(Department department) {
        int minSalary = Integer.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    if (emp.getSalary() < minSalary) {
                        minSalary = emp.getSalary();
                        employeeWithMinSalary = emp;
                    }
                }
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee maxSalaryDepartment(Department department) {
        int maxSalary = 0;
        Employee employeeWithMaxSalary = null;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    if (emp.getSalary() > maxSalary) {
                        maxSalary = emp.getSalary();
                        employeeWithMaxSalary = emp;
                    }
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public static int totalSalaryDepartment(Department department) {
        int total = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    total += emp.getSalary();
                }
            }
        }
        return total;
    }

    public static double averageSalaryDepartment(Department department) {
        int counter = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    counter++;
                }
            }
        }
        return totalSalaryDepartment(department)/counter;
    }

    public static void indexSalaryDepartment(Department department, double percent) {
        double index = 1 + percent / 100;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    emp.setSalary((int) (emp.getSalary() * index));
                }
            }
        }
    }

    public static void printEmployeesDepartment(Department department) {
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    System.out.println(emp.getSurname() + " " + emp.getName() + " " + emp.getFatherName());
                }
            }
        }
    }

    public static void printWithSalaryLessThan(int salary) {
        for (Employee emp: employees) {
            if (emp != null) {
                if (emp.getSalary() < salary) {
                    System.out.println(emp.toString());
                }
            }
        }
    }

}