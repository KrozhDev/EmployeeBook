public class EmployeeBuilder {

    private String name;
    private String surname;
    private String fatherName;
    private Department department;
    private int salary;

    public EmployeeBuilder name(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public EmployeeBuilder fatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public EmployeeBuilder department(Department department) {
        this.department = department;
        return this;
    }

    public EmployeeBuilder salary(int salary) {
        this.salary = salary;
        return this;
    }

    public Employee build() {
        return new Employee(name, surname, fatherName, department, salary);
    }
}
