import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        EmployeeBook eb = new EmployeeBook();


        Employee emp1 = new Employee("Иван", "Иванов", "Иванович", Department.FIRST, 150_000);
        System.out.println(emp1.getId());
        Employee emp2 = new Employee("Петр", "Петрович", "Иванович", Department.FIRST, 200_000);
        System.out.println(emp2.getId());

        eb.addNewEmployee(emp1);
        eb.addNewEmployee(emp2);
        eb.addNewEmployee(new Employee("Богдан", "Каркаев", "Андреевич", Department.SEC, 100_000));

        eb.printEmployees();
        System.out.println(eb.totalSalary());
        System.out.println(eb.minSalaryEmployee().toString());
        System.out.println(eb.maxSalaryEmployee().toString());
        System.out.println(eb.averageSalary());
        eb.printFIO();

        eb.indexSalary(10);
        eb.printEmployees();

        System.out.println(eb.minSalaryDepartment(Department.FIRST));
        System.out.println(eb.maxSalaryDepartment(Department.FIRST));
        System.out.println(eb.totalSalaryDepartment(Department.FIRST));
        System.out.println(eb.averageSalaryDepartment(Department.FIRST));

        eb.indexSalaryDepartment(Department.FIRST, 10);

        eb.printEmployeesDepartment(Department.FIRST);

        eb.printWithSalaryLessThan(150000);

        eb.delEmployee(emp1);

        eb.printEmployees();

        eb.addNewEmployee(emp1);

        eb.printEmployees();

        eb.findEmpByFioAndChangeSalaryAndDep("иванов иван иванович", 160000);

        eb.printEmployees();

        eb.printAllEmployeesByDepartments();


    }



}