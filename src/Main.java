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

        EmployeeBuilder eBuilder = new EmployeeBuilder();

        Employee emp4 = eBuilder.name("Анна")
                .surname("Воронова")
                .fatherName("Николаевна")
                .department(Department.THIRD)
                .salary(190000)
                .build();

        eb.addNewEmployee(emp4);

        eb.printAllEmployeesByDepartments();

        eb.printEmployees();

        Employee emp5 = eBuilder.name("Татьяна")
                .surname("Колесникова")
                .fatherName("Витальевна")
                .department(Department.THIRD)
                .salary(80000)
                .build();

        Employee emp6 = eBuilder.name("Константин")
                .surname("Рожков")
                .fatherName("Олегович")
                .department(Department.THIRD)
                .salary(180000)
                .build();

        Employee emp7 = eBuilder.name("Виктор")
                .surname("Михаилович")
                .fatherName("Зоров")
                .department(Department.FOURTH)
                .salary(60000)
                .build();

        Employee emp8 = eBuilder.name("Марина")
                .surname("Собко")
                .fatherName("Витальевна")
                .department(Department.FOURTH)
                .salary(200000)
                .build();

        Employee emp9 = eBuilder.name("Иван")
                .surname("Сидоров")
                .fatherName("Витальевич")
                .department(Department.FIFTH)
                .salary(70000)
                .build();

        Employee emp10 = eBuilder.name("Артем")
                .surname("Игнатов")
                .fatherName("Валентинович")
                .department(Department.FIFTH)
                .salary(50000)
                .build();

        eb.addNewEmployee(emp5);
        eb.addNewEmployee(emp6);
        eb.addNewEmployee(emp7);
        eb.addNewEmployee(emp8);
        eb.addNewEmployee(emp9);
        eb.addNewEmployee(emp10);

        eb.printAllEmployeesByDepartments();

        eb.printEmployees();

        System.out.println(eb.averageSalary());
        System.out.println(eb.maxSalaryDepartment(Department.FOURTH));

    }

}